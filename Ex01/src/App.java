import br.edu.up.models.Livro;

public class App {
    public static void main(String[] args) throws Exception {

        String[] autores1 = {"Cay S. Horstmann", "Gary Cornell"};
        Livro livro1 = new Livro("1598FHK", "Core Java 2", autores1, "0130819336", 2005);

        String[] autores2 = {"Harvey Deitel"};
        Livro livro2 = new Livro("9865PLO", "Java, Como programar", autores2, "0130341517", 2001);
            
    }
}
