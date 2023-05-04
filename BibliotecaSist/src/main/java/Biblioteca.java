import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;

public class Biblioteca  {
    private Map< String, Emprestar> acervo;
    public  Biblioteca(){
        acervo = new HashMap<>();
    }
    public void adicionarItem(String codigo, Emprestar item){
        acervo.put(codigo, item);
    }
    public void emprestarItem(String codigo){
        Emprestar item = acervo.get(codigo);
        if (item != null && item.isdisponivel()){
            item.emprestar();
            System.out.println(" Livro emprestado com sucesso ");
        }
        else{
            System.out.println(" Livro não disponivel ");
        }
    }

    public  void devolverItem(String codigo){
        Emprestar item = acervo.get(codigo);
        if (item != null){
            item.devolver();
            System.out.println(" Livro devolvido com sucesso ");
        }
        else{
            System.out.println(" Livro não encontrado ");
        }
    }

    public void exibirLivrosPorGenero(Genero genero) {
        System.out.println("Livros de gênero: " + genero);
        for (Map.Entry<String, Emprestar> entry : acervo.entrySet()) {
            Emprestar item = entry.getValue();
            if (item instanceof Livro) {
                Livro livro = (Livro) item;
                if (livro.getGenero() == genero) {
                    System.out.println("Código: " + entry.getKey() + " - Título: " + livro.getTitulo()
                            + " - Autor: " + livro.getAutor());
                }
            }
        }

    }
}


