public class Autor extends Pessoa {
     protected Integer qtdLivroPublicados;

     public Autor( String nome,Integer qtdLivroPublicados) {
          super(nome);
          this.qtdLivroPublicados = qtdLivroPublicados;
     }

     @Override
     public String toString() {
          return " Nome: " + this.getNome() +
                  " Quantidade de Livros Publicados " + qtdLivroPublicados;
     }
}
