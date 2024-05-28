import br.edu.up.Controllers.ControllerSeguro;
import br.edu.up.Views.SeguroView;

public class App {
    public static void main(String[] args) {
        SeguroView view = new SeguroView();
        ControllerSeguro controller = new ControllerSeguro(view);
        controller.iniciar();
    }
}
