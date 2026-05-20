import java.util.ArrayList;

public class Evento {

    private String nomeEvento;

    private ArrayList<Participante> participantes =
            new ArrayList<>();

    public Evento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void exibirParticipantes() {

        System.out.println("===== " + nomeEvento + " =====");

        for (Participante participante : participantes) {
            participante.exibirDados();
            System.out.println();
        }
    }
}