package br.com.cassiano;

public class Livro {
    private String titulo;
    private int totalPaginas;
    private int paginasLidas;

   public Livro(String titulo, int totalPaginas, int paginasLidas) {

    if (totalPaginas <= 0 || paginasLidas < 0 || paginasLidas > totalPaginas) {
    throw new IllegalArgumentException("Quantidade de páginas inválida!");
    }
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.paginasLidas = paginasLidas;

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

public void setTitulo(String titulo){
    this.titulo = titulo;
}

public void setTotalPaginas(int totalPaginas){

     if(totalPaginas <= 0 || totalPaginas < this.paginasLidas){
        throw new IllegalArgumentException("Total de páginas inválido!");
    }

    this.totalPaginas = totalPaginas;
}

public void setPaginasLidas(int paginasLidas){

     if(paginasLidas < 0 || paginasLidas > this.totalPaginas){
        throw new IllegalArgumentException("Quantidade de páginas inválida!");
    }

    this.paginasLidas = paginasLidas;
}

public int getFaltaLer() {
return this.totalPaginas - this.paginasLidas;
}

public void exibirResumo(){
    System.out.println("\nResumo: ");
    System.out.println("Livro: " + this.titulo);
    System.out.println("Faltam " + this.getFaltaLer() + " páginas para terminar o livro");
}

public void adicionarPaginasLidas(int quantidade){

    if (quantidade <= 0) {
    System.out.println("Quantidade inválida!");
    return;
}
    if(this.paginasLidas + quantidade > this.totalPaginas){
        System.out.println("O número de páginas foi ultrapassado");
        return;
    }

    this.paginasLidas = this.paginasLidas + quantidade;

    System.out.println("Progresso atualizado!");

}
}
