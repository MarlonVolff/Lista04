import br.edu.up.controllers.ControleAgenda;
import br.edu.up.views.Menu;

public class Program {
    public static void main(String[] args) {
        ControleAgenda ctrlAgenda = new ControleAgenda();
        ctrlAgenda.incluirContatoPessoal(101, "CARLINHOSVEMCA!", "323131243234", "098098089789");

        Menu menu = new Menu();
        menu.mostrar();
    }
}