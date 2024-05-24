package br.edu.up.views;
import java.util.ArrayList;
import br.edu.up.models.*;

public class Menu {

    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static ArrayList<Aeronave> aeronaves = new ArrayList<>();

    public void adicionarPassageiro() {
        Passageiro passageiro = VooView.getPassageiro();
        pessoas.add(passageiro);
        System.out.println("Passageiro add!");

    }

    public void adicionarTripulacao() {
        Tripulacao tripulacao = VooView.geTripulacao();
        pessoas.add(tripulacao);
        System.out.println("Tripulante add!");
    }

    // public void acentos(){  
    // }
    
}
