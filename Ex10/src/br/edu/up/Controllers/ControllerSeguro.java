package br.edu.up.Controllers;

import br.edu.up.Models.*;
import br.edu.up.Views.SeguroView;

import java.util.ArrayList;
import java.util.List;

public class ControllerSeguro {
    private SeguroView view;
    private List<Seguro> seguros;

    public ControllerSeguro(SeguroView view) {
        this.view = view;
        this.seguros = new ArrayList<>();
    }

    public void iniciar() {
        boolean executando = true;

        while (executando) {
            view.exibirMenu();
            int escolha = view.obterEscolhaUsuario();

            switch (escolha) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    executando = false;
                    view.exibirMensagem("Saindo do programa");
                    break;
                default:
                    view.exibirMensagem("Tente novamente!");
                    break;
            }
        }
    }

    private void incluirSeguro() {
        String apolice = view.obterEntrada("Digite o número da apólice: ");
        if (apoliceExiste(apolice)) {
            view.exibirMensagem("A apólice já existe");
            return;
        }

        String nome = view.obterEntrada("Informe o nome do segurado: ");
        String cpf = view.obterEntrada("Informe o CPF do segurado: ");
        String rg = view.obterEntrada("Informe o RG do segurado: ");
        String sexo = view.obterEntrada("Informe o sexo do segurado: ");
        String endereco = view.obterEntrada("Informe o endereço do segurado: ");
        String telefone = view.obterEntrada("Informe o telefone do segurado: ");
        String cep = view.obterEntrada("Informe o CEP do segurado: ");
        String cidade = view.obterEntrada("Informe a cidade do segurado: ");
        Segurado segurado = new Segurado(nome, cpf, rg, sexo, endereco, telefone, cep, cidade);

        String tipoSeguro = view.obterEntrada("Digite o tipo de seguro (vida/veiculo): ");

        if (tipoSeguro.equalsIgnoreCase("vida")) {
            boolean cobreDoenca = view.obterBoolean("O seguro cobre doença?: ");
            boolean cobreAcidente = view.obterBoolean("O seguro cobre acidente?: ");
            SeguroVida seguroVida = new SeguroVida(apolice, segurado, cobreDoenca, cobreAcidente);
            seguros.add(seguroVida);
            view.exibirMensagem("Seguro de vida incluído com sucesso.");
        } else if (tipoSeguro.equalsIgnoreCase("veiculo")) {
            double valorFranquia = view.obterDouble("Digite o valor da franquia: ");
            boolean temCarroReserva = view.obterBoolean("O seguro tem carro reserva?: ");
            boolean cobreVidro = view.obterBoolean("O seguro cobre vidro?: ");
            SeguroVeiculo seguroVeiculo = new SeguroVeiculo(apolice, segurado, valorFranquia, temCarroReserva,
                    cobreVidro);
            seguros.add(seguroVeiculo);
            view.exibirMensagem("Seguro de veículo incluído com sucesso.");
        } else {
            view.exibirMensagem("Tipo de seguro inválido.");
        }
    }

    private void localizarSeguro() {
        String apolice = view.obterEntrada("Digite o número da apólice: ");
        Seguro seguro = buscarSeguro(apolice);
        if (seguro != null) {
            view.exibirDetalhesSeguro(seguro.toString());
        } else {
            view.exibirMensagem("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        String apolice = view.obterEntrada("Digite o número da apólice: ");
        Seguro seguro = buscarSeguro(apolice);
        if (seguro != null) {
            seguros.remove(seguro);
            view.exibirMensagem("Seguro excluído com sucesso.");
        } else {
            view.exibirMensagem("Seguro não encontrado.");
        }
    }

    private void excluirTodosSeguros() {
        if (view.confirmarExclusao()) {
            seguros.clear();
            view.exibirMensagem("Todos os seguros foram excluídos.");
        } else {
            view.exibirMensagem("Exclusão cancelada.");
        }
    }

    private void listarTodosSeguros() {
        for (Seguro seguro : seguros) {
            view.exibirDetalhesSeguro(seguro.toString());
        }
    }

    private void verQuantidadeSeguros() {
        view.exibirMensagem("Quantidade de seguros: " + seguros.size());
    }

    private boolean apoliceExiste(String apolice) {
        return seguros.stream().anyMatch(seguro -> seguro.getApolice().equals(apolice));
    }

    private Seguro buscarSeguro(String apolice) {
        return seguros.stream().filter(seguro -> seguro.getApolice().equals(apolice)).findFirst().orElse(null);
    }
}
