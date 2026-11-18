package br.com.cassiano;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    System.out.print("Qual o título do livro? ");
    String titulo = teclado.nextLine();

    System.out.print("Quantas páginas o livro tem ao todo? ");
    int totalPaginas = teclado.nextInt();

    System.out.print("Quantas páginas você já leu hoje? ");
    int paginasLidas = teclado.nextInt();

    int faltaLer = totalPaginas - paginasLidas;

    System.out.println("\n Resumo: ");
    System.out.println("Livro: " + titulo);
    System.out.println("Faltam " + faltaLer + " para terminar o livro");

    if(paginasLidas >= 2){
        System.out.println("Meta alcançada! Parabéns pelo dia!");
    }else{
        System.out.println("Dá pra melhorar ein");
    }
        teclado.close();

    }
}