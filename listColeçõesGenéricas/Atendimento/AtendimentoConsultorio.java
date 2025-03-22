package listColeçõesGenéricas.Atendimento;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class AtendimentoConsultorio {
    public static void main(String[] args) {
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Queue<Paciente> filaComum = new LinkedList<>();
        Random random = new Random();

        int totalPacientes = 20;
        int tempoAtual = 0;  // Minutos do dia
        int pacientesAtendidos = 0;

        System.out.println("🏥 Início do dia no consultório médico!");

        // Simular chegada de pacientes a cada 4 minutos
        for (int i = 0; i < totalPacientes; i++) {
            int rg = 100000 + random.nextInt(900000);  // RG aleatório (6 dígitos)
            int idade = 10 + random.nextInt(80); // Idade entre 10 e 89 anos
            Paciente novoPaciente = new Paciente(rg, idade);

            if (idade >= 60) {
                filaPrioritaria.add(novoPaciente);
            } else {
                filaComum.add(novoPaciente);
            }

            System.out.println("🕒 Minuto " + tempoAtual + ": Paciente chegou → " + novoPaciente);
            tempoAtual += 4;  // Novo paciente chega a cada 4 minutos
        }

        System.out.println("\n🚑 Início dos atendimentos!\n");

        tempoAtual = 0;  // Resetando o tempo para atendimento

        // Simular atendimento de 20 pacientes
        while (pacientesAtendidos < totalPacientes) {
            if (!filaPrioritaria.isEmpty()) {
                Paciente atendido = filaPrioritaria.poll();
                System.out.println("✅ Atendendo paciente prioritário: " + atendido + " [Tempo: " + tempoAtual + " minutos]");
            } else if (!filaComum.isEmpty()) {
                Paciente atendido = filaComum.poll();
                System.out.println("✅ Atendendo paciente comum: " + atendido + " [Tempo: " + tempoAtual + " minutos]");
            }
            
            tempoAtual += 5; // Atendimento dura 5 minutos
            pacientesAtendidos++;
        }

        System.out.println("\n🏥 O consultório fechou. Todos os pacientes do dia foram atendidos!");
    }
}
