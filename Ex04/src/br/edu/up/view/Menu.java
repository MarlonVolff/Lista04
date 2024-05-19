package br.edu.up.Controllers.views;

import java.util.Scanner;

import br.edu.up.Controllers.models.Carro;
import br.edu.up.Controllers.models.Estacionamento;

public class Menu {
    private Scanner scanner;
    private Estacionamento estacionamento;

    public Menu() {
        scanner = new Scanner(System.in);
        estacionamento = new Estacionamento();
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Entrada de veículo");
            System.out.println("2. Saída de veículo");
            System.out.println("3. Emitir relatório");
            System.out.println("4. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    entradaVeiculo();
                    break;
                case 2:
                    saidaVeiculo();
                    break;
                case 3:
                    emitirRelatorio();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    private void entradaVeiculo() {
        System.out.println("=== Entrada de Veículo ===");
        Carro carro = solicitarDadosCarro();
        int vagaDisponivel = estacionamento.encontrarVagaDisponivel();
        if (vagaDisponivel != -1) {
            estacionamento.getVagas()[vagaDisponivel].ocuparVaga(carro.getPlaca(), carro.getModelo(), carro.getCor());
            System.out.println("Veículo estacionado com sucesso na vaga " + (vagaDisponivel + 1) + ".");
        } else {
            System.out.println("Não há vagas disponíveis no momento.");
        }
    }

    private void saidaVeiculo() {
        System.out.println("=== Saída de Veículo ===");
        String placa = solicitarPlaca();
        int vagaOcupada = estacionamento.verificarPlaca(placa);
        if (vagaOcupada != -1) {
            estacionamento.getVagas()[vagaOcupada].removerCarro();
            System.out.println("Veículo removido com sucesso da vaga " + (vagaOcupada + 1) + ".");
        } else {
            System.out.println("Veículo não encontrado no estacionamento.");
        }
    }

    private void emitirRelatorio() {
        System.out.println("=== Relatório ===");
        int entradas = 0;
        int saidas = 0;
        for (int i = 0; i < estacionamento.getTotalVagas(); i++) {
            if (estacionamento.getVagas()[i].getCarroPlaca() != null) {
                entradas++;
            }
        }
        saidas = estacionamento.getTotalVagas() - entradas;
        System.out.println("Total de veículos entrados: " + entradas);
        System.out.println("Total de veículos saídos: " + saidas);
        System.out.println("Valor total arrecadado: R$" + (entradas * 5));
    }

    private Carro solicitarDadosCarro() {
        System.out.print("Modelo do carro: ");
        String modelo = scanner.next();
        System.out.print("Placa do carro: ");
        String placa = scanner.next();
        System.out.print("Cor do carro: ");
        String cor = scanner.next();
        return new Carro(modelo, placa, cor);
    }

    private String solicitarPlaca() {
        System.out.print("Digite a placa do carro: ");
        return scanner.next();
    }
}