import java.util.List;

public class Main {
    public static void main(String[] args) {

        //EMANUEL 2211550715
        //joão Fernando 2211551100

       Biblioteca biblioteca = new Biblioteca();
       Livro livro1 = new Livro("Aprenda Java",
               new Autor(" lucas",20), Genero.TERROR,true);
       Livro livro2 = new Livro("Python new"
               ,new Autor("Pedro",10000), Genero.COMEDIA,true);

        Livro livro3 = new Livro("Java",
                new Autor(" luca",20), Genero.COMEDIA,false);

        Livro livro4 = new Livro("Aprenda",
                new Autor(" yes",20), Genero.COMEDIA,true);

       biblioteca.adicionarItem("001",livro1);
       biblioteca.adicionarItem("002",livro2);
        biblioteca.adicionarItem("008",livro3);
        biblioteca.adicionarItem("004",livro4);


       biblioteca.emprestarItem("001");
       biblioteca.emprestarItem("002");

        biblioteca.devolverItem("002");
        biblioteca.devolverItem("005");

       biblioteca.exibirLivrosPorGenero(Genero.TERROR);
       biblioteca.exibirLivrosPorGenero(Genero.COMEDIA);

    }
}