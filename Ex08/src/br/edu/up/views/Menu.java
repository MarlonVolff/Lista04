package br.edu.up.views;

import br.edu.up.controllers.ControleAgenda;
import br.edu.up.Prompt;

public class Menu {
    private ControleAgenda controleAgenda;

    public Menu() {
        this.controleAgenda = new ControleAgenda();
    }

    public void mostrar() {
        System.out.println("   Menu   ");
        System.out.println("1. Incluir contato pessoal");
        System.out.println("2. Incluir contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa ");
        System.out.println();

        int op;
        do {
            op = Prompt.lerInteiro();
            switch (op) {
                case 1:
                    incluirPessoal();
                    break;
                case 2:
                    incluirComercial();
                    break;
                case 3:
                    // Implementar exclusão de contato
                    break;
                case 4:
                    // Implementar consulta de contato pelo código
                    break;
                case 5:
                    // Implementar listagem de todos os contatos
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (op != 6);
    }

    public void incluirPessoal() {
        System.out.println("Informe os dados");
        int cod = Prompt.lerInteiro("Código:");
        String nome = Prompt.lerLinha("Nome:");
        String telefone = Prompt.lerLinha("Telefone:");
        String aniversario = Prompt.lerLinha("Aniversário:");

        controleAgenda.incluirContatoPessoal(cod, nome, telefone, aniversario);
    }

    public void incluirComercial() {
        System.out.println("Informe os dados");
        int cod = Prompt.lerInteiro("Código:");
        String nome = Prompt.lerLinha("Nome:");
        String telefone = Prompt.lerLinha("Telefone:");
        String cnpj = Prompt.lerLinha("CNPJ:");

        controleAgenda.incluirContatoComercial(cod, nome, telefone, cnpj);
    }
}