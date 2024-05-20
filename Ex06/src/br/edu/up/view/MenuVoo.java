package br.edu.up.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.edu.up.models.Aeronave;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Passagem;
import br.edu.up.models.Pessoa;
import br.edu.up.models.Tripulacao;

public class MenuVoo {
    public void mostrarMenu() {
        System.out.println("1. Adicionar passageiro");
        System.out.println("2. Adicionar tripulação");
        System.out.println("3. Verificar disponibilidade de assentos");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static Passageiro getPassageiro(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do passageiro: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o RG do passageiro: ");
        String rg = leitor.nextLine();

        System.out.print("Digite o identificador de bagagem do passageiro: ");
        String identificadorBagagem = leitor.nextLine();

        System.out.print("Digite o número do acento da passagem do passageiro: ");
        String numAcento = leitor.nextLine();

        System.out.print("Digite a classe do acento da passagem do passageiro: ");
        String classe = leitor.nextLine();

        System.out.print("Digite a data do voo: ");
        String dataVooStr = leitor.nextLine();

        // Em Java, a classe "SimpleDateFormat" é usada para formatar e analisar datas em texto. O método "parse(String)" é usado para analisar texto de uma string para produzir um Date.

        Date dataVoo = null;
        try{
            dataVoo = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataVooStr);
        } catch (ParseException e){
            System.out.println("Erro ao analisar a data. Certifique-se de que está no formato Corretamente!!!");
        }

        Passagem passagem = new Passagem(numAcento, classe, dataVoo);
        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, passagem);

        return passageiro;
    }

    public static Tripulacao geTripulacao(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do Tripulante: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o RG do Tripulante: ");
        String rg = leitor.nextLine();

        System.out.print("Digite o RAB do tripulante: ");
        String identificadorAeronautica = leitor.nextLine();

        System.out.print("Digite a matricula: ");
        String matricula = leitor.nextLine();


        Tripulacao tripulacao = new Tripulacao(nome, rg, identificadorAeronautica, matricula);

        return tripulacao;
    }
    

    public static Aeronave getAcentos(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código da aeronave: ");
        String codigo = leitor.nextLine();
        
        System.out.println("Digite o tipo da aeronave: ");
        String tipo = leitor.nextLine();

        System.out.println("Digite a quantidade de acentos: ");
        int quantidadeAssentos = leitor.nextInt();

        Aeronave aeronave = new Aeronave(codigo, tipo, quantidadeAssentos);

        return aeronave;
    }

    
}package br.edu.up.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.edu.up.models.Aeronave;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Passagem;
import br.edu.up.models.Pessoa;
import br.edu.up.models.Tripulacao;

public class MenuVoo {
    public void mostrarMenu() {
        System.out.println("** Bem-Vindo ao Terminal **");
        System.out.println("1. Adicionar passageiro");
        System.out.println("2. Adicionar tripulação");
        System.out.println("3. Verificar disponibilidade de assentos");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static Passageiro getPassageiro(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do passageiro: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o RG do passageiro: ");
        String rg = leitor.nextLine();

        System.out.print("Digite o identificador de bagagem do passageiro: ");
        String identificadorBagagem = leitor.nextLine();

        System.out.print("Digite o número do acento da passagem do passageiro: ");
        String numAcento = leitor.nextLine();

        System.out.print("Digite a classe do acento da passagem do passageiro: ");
        String classe = leitor.nextLine();

        System.out.print("Digite a data do voo (dd/MM/yyyy HH:mm): ");
        String dataVooStr = leitor.nextLine();

        Date dataVoo = null;
        try{
            dataVoo = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataVooStr);
        } catch (ParseException e){
            System.out.println("Erro ao analisar.!");
        }
        Passagem passagem = new Passagem(numAcento, classe, dataVoo);
        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, passagem);

        return passageiro;
    }

    public static Tripulacao geTripulacao(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do Tripulante: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o RG do Tripulante: ");
        String rg = leitor.nextLine();

        System.out.print("Digite o RAB do tripulante: ");
        String identificadorAeronautica = leitor.nextLine();

        System.out.print("Digite a matricula: ");
        String matricula = leitor.nextLine();


        Tripulacao tripulacao = new Tripulacao(nome, rg, identificadorAeronautica, matricula);

        return tripulacao;
    }
    

    public static Aeronave getAcentos(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código da aeronave: ");
        String codigo = leitor.nextLine();
        
        System.out.println("Digite o tipo da aeronave: ");
        String tipo = leitor.nextLine();

        System.out.println("Digite a quantidade de acentos: ");
        int quantidadeAssentos = leitor.nextInt();

        Aeronave aeronave = new Aeronave(codigo, tipo, quantidadeAssentos);

        return aeronave;
    }

    
}