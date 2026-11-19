package br.com.cassiano;

public class Livro {
   private String titulo;
   private int totalPaginas;
   private int paginasLidas;
   private int faltaLer;

   public Livro(String titulo, int totalPaginas, int paginasLidas, int faltaLer) {
    this.titulo = titulo;
    this.totalPaginas = totalPaginas;
    this.paginasLidas = paginasLidas;
    this.faltaLer = faltaLer;
}
public String getTitulo() {
    return titulo;
}
public int getTotalPaginas(){
    return totalPaginas;
}

public int getPaginasLidas(){
    return paginasLidas;
}

public int getFaltaLer(){
    return faltaLer;
}
}
