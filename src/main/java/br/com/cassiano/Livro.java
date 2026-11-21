package br.com.cassiano;

public class Livro {
    private String titulo;
    private int totalPaginas;
    private int paginasLidas;
    private int metaPaginas;

    public Livro(String titulo, int totalPaginas, int paginasLidas, int metaPaginas) {

        if (totalPaginas <= 0 || paginasLidas <= 0 || paginasLidas > totalPaginas || metaPaginas <= 0) {
            throw new IllegalArgumentException("Quantidade de páginas inválida!");
        }
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.paginasLidas = paginasLidas;
        this.metaPaginas = metaPaginas;

    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public int getMetaPaginas() {
        return metaPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTotalPaginas(int totalPaginas) {

        if (totalPaginas <= 0 || totalPaginas < this.paginasLidas) {
            throw new IllegalArgumentException("Total de páginas inválido!");
        }

        this.totalPaginas = totalPaginas;
    }

    public void setPaginasLidas(int paginasLidas) {

        if (paginasLidas < 0 || paginasLidas > this.totalPaginas) {
            throw new IllegalArgumentException("Quantidade de páginas inválida!");
        }

        this.paginasLidas = paginasLidas;
    }

    public int getFaltaLer() {
        return this.totalPaginas - this.paginasLidas;
    }

    public double porcentagemLivro() {
        return ((double) this.paginasLidas / this.totalPaginas) * 100;
    }

    public double porcentagemRestante() {
        return ((double) this.getFaltaLer() / this.totalPaginas) * 100;
    }

    public void exibirResumo() {
        System.out.println("\nResumo: ");
        System.out.println("Livro: " + this.titulo);
        System.out.println("Faltam " + this.getFaltaLer() + " páginas para terminar o livro");
        System.out.println("A porcentagem que falta para terminar o livro é: " + porcentagemRestante() + " %");
        if (porcentagemRestante() <= 30) {
            System.out.println("Não desista! Você está quase lá");
        }
        System.err.println("O Livro já está: " + porcentagemLivro() + " % Concluído");
    }

    public void adicionarPaginasLidas(int quantidade) {

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida!");
            return;
        }
        if (this.paginasLidas + quantidade > this.totalPaginas) {
            System.out.println("O número de páginas foi ultrapassado");
            return;
        }

        this.paginasLidas = this.paginasLidas + quantidade;

        System.out.println("Progresso atualizado!");

    }
}
