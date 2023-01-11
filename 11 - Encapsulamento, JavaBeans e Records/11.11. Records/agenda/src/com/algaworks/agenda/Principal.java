package com.algaworks.agenda;

public class Principal {

    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);

        Agendamento agendamento = new Agendamento(horario, "Corte de cabelo");
        agendamento.setHorario(new Horario(16, 30));

        System.out.println(agendamento.getHorarioFormatado());
        System.out.println(horario.formatar());
        System.out.println(horario.hora() + "h" + horario.minuto() + "m");
    }
}
