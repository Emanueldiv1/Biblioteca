public class Livro implements Emprestar {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private boolean disponivel;




    public Livro (String titulo, Autor autor, Genero genero, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }

    @Override
    public boolean isdisponivel() {
        return disponivel;
    }

    @Override
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
        else {
            System.out.println(" Livro ja emprestado. ");
        }
    }

    @Override
    public void devolver() {
        disponivel = true;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Nome: " + titulo + " Genero: " + genero + "Autor :" +
                autor + "disponibilidade do livro : " + disponivel;
    }

}
