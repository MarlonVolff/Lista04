import br.edu.up.controllers.Compromisso;
import br.edu.up.controllers.Dia;
import br.edu.up.controllers.Mes;

public class App {
    public static void main(String[] args) {
        // Criar os três meses do ano
        Mes janeiro = new Mes(31, "Janeiro");

        // Adicionar os dias aos meses
        adicionarDiasAoMes(janeiro);

        // Adicionar compromissos aos dias
        adicionarCompromissos(janeiro);

        // Listar os compromissos de cada mês
        System.out.println(janeiro.listarCompromissos());
    }

    private static void adicionarDiasAoMes(Mes mes) {
        for (int i = 1; i <= mes.getQtdeDias(); i++) {
            Dia dia = new Dia(i);
            mes.adicionarDia(dia);
        }
    }

    private static void adicionarCompromissos(Mes janeiro) {
        Compromisso comp1 = new Compromisso("João", "Sala de Reuniões", "Reunião de equipe", 9);
        Compromisso comp2 = new Compromisso("Maria", "Restaurante", "Almoço", 12);
        Compromisso comp3 = new Compromisso("Pedro", "Clínica Médica", "Consulta médica", 15);

        janeiro.adicionarCompromisso(comp1, 17);
        janeiro.adicionarCompromisso(comp2, 17);
        janeiro.adicionarCompromisso(comp3, 18);
    }
}
