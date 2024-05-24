package br.edu.up.View;

import java.util.Scanner;
import br.edu.up.Controller.*;
import br.edu.up.Model.*;

public class View {

    private EventoController eventoController;
    private ReservaController reservaController;

    Scanner read = new Scanner(System.in);

    public void menuPrincipal() {
        int opc = -1;

        while (opc != 0) {
            System.out.println("Menu Principal: ");
            System.out.println("1. Gerenciamento de Eventos");
            System.out.println("2. Gerenciamento de Reservas");
            System.out.println("0. Sair");
            opc = read.nextInt();
            read.nextLine();
        }

        switch (opc) {
            case 1:
                menuEvento();
                break;
            case 2:
                menuReserva();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                break;
        }
    }

    public void menuEvento() {
        int opc = -1;

        while (opc != 0) {
            System.out.println("Menu Evento: ");
            System.out.println("1. Incluir Evento");
            System.out.println("2. Alterar Evento");
            System.out.println("3. Listar Evento");
            System.out.println("4. Excluir Evento");
            System.out.println("0. Sair");
            opc = read.nextInt();
            read.nextLine();
        }

        switch (opc) {
            case 1:
                incluirEvento();
                break;
            case 2:
                alterarEvento();
                break;
            case 3:
                listarEventos();
                break;
            case 4:
                excluirEvento();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public void menuReserva() {
        int opc = -1;

        while (opc != 0) {
            System.out.println("Menu Reserva: ");
            System.out.println("1. Incluir Reserva");
            System.out.println("2. Alterar Reserva");
            System.out.println("3. Listar Reserva");
            System.out.println("4. Excluir Reserva");
            System.out.println("0. Sair");
            opc = read.nextInt();
            read.nextLine();
        }

        switch (opc) {
            case 1:
                incluirReserva();
                break;
            case 2:
                alterarReserva();
                break;
            case 3:
                listarReservas();
                break;
            case 4:
                excluirReserva();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    // Fuções Menu Evento
    private void incluirEvento() {
        System.out.println("Incluir Evento");
        Evento evento = new Evento();

        System.out.print("Nome: ");
        evento.setNome(read.nextLine());

        System.out.print("Data (dd-mm-aaaa): ");
        evento.setData(read.nextLine());

        System.out.print("Local: ");
        evento.setLocal(read.nextLine());

        System.out.print("Lotação Máxima: ");
        evento.setLotacaoMax(read.nextInt());

        System.out.print("Ingressos Vendidos: ");
        evento.setIngressosVendidos(read.nextInt());

        System.out.print("Preço do Ingresso: ");
        evento.setPrecoIngreco(read.nextDouble());
        read.nextLine();

        eventoController.criarEvento(evento);
    }

    private void alterarEvento() {
        System.out.println("Alterar Evento");
        System.out.print("ID do Evento: ");
        int id = read.nextInt();
        read.nextLine();

        Evento evento = eventoController.obterEvento(id);
        if (evento == null) {
            System.out.println("Evento não encontrado.");
            return;
        }

        System.out.print("Nome (" + evento.getNome() + "): ");
        evento.setNome(read.nextLine());

        System.out.print("Data (" + evento.getData() + ") (AAAA-MM-DD): ");
        evento.setData(read.nextLine());

        System.out.print("Local (" + evento.getLocal() + "): ");
        evento.setLocal(read.nextLine());

        System.out.print("Lotação Máxima (" + evento.getLotacaoMax() + "): ");
        evento.setLotacaoMax(read.nextInt());

        System.out.print("Ingressos Vendidos (" + evento.getIngressosVendidos() + "): ");
        evento.setIngressosVendidos(read.nextInt());

        System.out.print("Preço do Ingresso (" + evento.getPrecoIngreco() + "): ");
        evento.setPrecoIngreco(read.nextDouble());
        read.nextLine();

        eventoController.atualizarEvento(evento);
    }

    private void listarEventos() {
        System.out.println("Listar Eventos");
        eventoController.listarEventos();
    }

    private void excluirEvento() {
        System.out.println("Excluir Evento");
        System.out.print("ID do Evento: ");
        int id = read.nextInt();
        read.nextLine();

        Evento evento = eventoController.obterEvento(id);
        if (evento != null) {
            eventoController.excluirEvento(evento);
            return;
        }
        System.out.println("Evento não encontrado.");
    }

    // Funções Menu Reserva
    private void incluirReserva() {
        System.out.println("Incluir Reserva");
        Reserva reserva = new Reserva();

        System.out.print("Nome do responsável: ");
        reserva.setNomeResponsavel(read.nextLine());

        System.out.print("Quantidade de pessoas: ");
        reserva.setQntPessoas(read.nextInt());

        System.out.print("Data (dd-mm-aaaa): ");
        reserva.setData(read.nextLine());

        System.out.print("Valor total: ");
        reserva.setValorTotal(read.nextDouble());
        read.nextLine();

        reservaController.criarReserva(reserva);
    }

    private void alterarReserva() {
        System.out.println("Alterar Reserva");
        System.out.print("ID da Reserva: ");
        int id = read.nextInt();
        read.nextLine();

        Reserva reserva = reservaController.obterReserva(id);
        if (reserva == null) {
            System.out.println("Reserva não encontrado.");
            return;
        }

        System.out.print("Nome do responsável(" + reserva.getNomeResponsavel() + "): ");
        reserva.setNomeResponsavel(read.nextLine());

        System.out.print("Data (" + reserva.getData() + ") (AAAA-MM-DD): ");
        reserva.setData(read.nextLine());

        System.out.print("Quantidade de pessoas (" + reserva.getQntPessoas() + "): ");
        reserva.setQntPessoas(read.nextInt());

        System.out.print("Valor total (" + reserva.getValorTotal() + "): ");
        reserva.setValorTotal(read.nextDouble());
        read.nextLine();

        reservaController.atualizarReserva(reserva);
    }

    private void listarReservas() {
        System.out.println("Listar Reservas");
        reservaController.listarReservas();
    }

    private void excluirReserva() {
        System.out.println("Excluir Reserva");
        System.out.print("ID da Reserva: ");
        int id = read.nextInt();
        read.nextLine();

        Reserva reserva = reservaController.obterReserva(id);
        if (reserva != null) {
            reservaController.excluirReserva(reserva);
            return;
        }
        System.out.println("Reserva não encontrado.");
    }
}
