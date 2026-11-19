package br.com.cassiano;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Livro> estante = new ArrayList<>();
    System.out.print("Qual o título do livro? ");
    String titulo = teclado.nextLine();

    System.out.print("Quantas páginas o livro tem ao todo? ");
    int totalPaginas = teclado.nextInt();

    System.out.print("Quantas páginas você já leu hoje? ");
    int paginasLidas = teclado.nextInt();

    int faltaLer = totalPaginas - paginasLidas;
        Livro livro = new Livro(titulo, totalPaginas, paginasLidas, faltaLer);
        estante.add(livro);
    for (iterable_type iterable_element : iterable) {
        
    for (Livro livro : estante){
    System.out.println("\n Resumo: ");
    System.out.println("Livro: " + livro.getTitulo());
    System.out.println("Faltam " + livro.getFaltaLer() + " páginas para terminar o livro");
    }
    if(livro.getPaginasLidas() >= 2){
        System.out.println("Meta alcançada! Parabéns pelo dia!");
    }else{
        System.out.println("Dá pra melhorar ein");
    }
    System.out.println(estante.size());
        teclado.close();

    }
}