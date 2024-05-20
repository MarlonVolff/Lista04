package br.edu.up.Controller;

import br.edu.up.Model.*;

public class EventoController {
    private Evento[] eventos;
    private int count;

    public void criarEvento(Evento evento) {
        if (count < eventos.length)
            eventos[count++] = evento;
    }

    public void excluirEvento(Evento evento) {
        for (int i = 0; i < count; i++) {
            if (eventos[i] == evento) {
                eventos[i] = eventos[--count];
                eventos[count] = null;
                break;
            }
        }
    }

    // Atualiza o evento pela ID
    public void atualizarEvento(Evento evento) {
        for (int i = 0; i < count; i++) {
            if (eventos[i].getId() == evento.getId()) {
                eventos[i] = evento;
                break;
            }
        }
    }

    public String listarEventos() {
        String temp = "Listagem de Eventos";
        for (int i = 0; i <= count; i++) {
            if (eventos[i] != null) {
                temp += "\n";
                temp += eventos[i].toString();
            }
        }
        return temp;
    }

    public Evento obterEvento(int id) {
        for (int i = 0; i <= count; i++) {
            if (eventos[i].getId() == id)
                return eventos[i];
        }
        return null;
    }
}
