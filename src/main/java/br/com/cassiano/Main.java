package br.com.cassiano;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Livro> estante = new ArrayList<>();
        int quantidadeLivros = 0;

        while (quantidadeLivros <= 0) {
            try {
                System.out.println("Qual a quantdade de livros que você costuma ler? ");
                quantidadeLivros = teclado.nextInt();
                teclado.nextLine();

                if (quantidadeLivros <= 0) {
                    System.out.println("Digite uma quantidade maior que zero!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números inteiros");
                teclado.nextLine();
            }
        }
        while (estante.size() < quantidadeLivros) {
            int totalPaginas = 0;
            int paginasLidas = -1;
            int metaPaginas = 0;

            System.out.print("\nQual o título do livro? ");
            String titulo = teclado.nextLine();

            while (totalPaginas <= 0) {
                try {
                    System.out.println("Qual o total de páginas do livro? ");
                    totalPaginas = teclado.nextInt();
                    teclado.nextLine();

                    if (totalPaginas <= 0) {
                        System.out.println("Digite uma quantidade maior que zero!");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números inteiros");
                    teclado.nextLine();
                }
            }
            while (paginasLidas < 0 || paginasLidas > totalPaginas) {
                try {
                    System.out.print("Quantas páginas você já leu hoje? ");
                    paginasLidas = teclado.nextInt();
                    teclado.nextLine();

                    if (paginasLidas < 0 || paginasLidas > totalPaginas) {
                        System.out.println("Quantidade de páginas inválida!");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números inteiros!");
                    teclado.nextLine();
                }
            }

            while (metaPaginas <= 0) {
                try {
                    System.out.print("Qual sua meta de leitura para hoje? ");
                    metaPaginas = teclado.nextInt();
                    teclado.nextLine();

                    if (metaPaginas <= 0) {
                        System.out.println("Digite uma quantidade maior que zero!");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números inteiros!");
                    teclado.nextLine();
                }
            }

            try {

                Livro livro = new Livro(titulo, totalPaginas, paginasLidas, metaPaginas);
                estante.add(livro);

            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao cadastrar livro: " + e.getMessage());

            }

        }
        for (Livro livroAtual : estante) {
            livroAtual.exibirResumo();

            if (livroAtual.getPaginasLidas() >= livroAtual.getMetaPaginas()) {
                System.out.println("Meta alcançada! Parabéns pelo dia!\n");
            } else {
                System.out.println("Meta do dia não foi alcançada\n");
            }

            System.out.println("Total de livros na estante: " + estante.size());
            teclado.close();

        }
    }
}
