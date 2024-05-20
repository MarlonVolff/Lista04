package br.edu.up.Controllers;
import java.util.Scanner;
import br.edu.up.views.Voo;
import br.edu.up.views.VooView;

public class ControllerAerio{
    public VooView views;
    public Voo voo;


    public ControllerAerio(VooView views, Voo voo) {
        this.views = views;
        this.voo = voo;
    }
   
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            views.mostrarMenu();
            String opcao = scanner.nextLine();
        
            switch (opcao) {
                case "1":
                    voo.addPassageiro();
                    break;
                case "2":
                    voo.addTripulacao();
                    break;
                case "3":
                    voo.acentos();
                    break;
                case "4":
                    System.out.println("Fechar o sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Tente novamente!");
            }
        }
    }

   
    
}