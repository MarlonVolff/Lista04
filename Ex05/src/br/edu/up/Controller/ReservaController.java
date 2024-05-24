package br.edu.up.Controller;

import br.edu.up.Model.*;

public class ReservaController {
    private Reserva[] reservas;
    private int count;

    public void criarReserva(Reserva reserva) {
        if (count < reservas.length)
            reservas[count++] = reserva;
    }

    public void excluirReserva(Reserva reserva) {
        for (int i = 0; i < count; i++) {
            if (reservas[i] == reserva) {
                reservas[i] = reservas[--count];
                reservas[count] = null;
                break;
            }
        }
    }

    // Atualiza o evento pela ID
    public void atualizarReserva(Reserva reserva) {
        for (int i = 0; i < count; i++) {
            if (reservas[i].getId() == reserva.getId()) {
                reservas[i] = reserva;
                break;
            }
        }
    }

    public String listarReservas() {
        String temp = "Listagem de Reservas";
        for (int i = 0; i <= count; i++) {
            if (reservas[i] != null) {
                temp += "\n";
                temp += reservas[i].toString();
            }
        }
        return temp;
    }

    public Reserva obterReserva(int id) {
        for (int i = 0; i <= count; i++) {
            if (reservas[i].getId() == id)
                return reservas[i];
        }
        return null;
    }
}
