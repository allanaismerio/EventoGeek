public class Inscricao {

    private int id;
    private String status;
    private Participante participante;
    private Evento evento;

    public Inscricao(
            int id,
            Participante participante,
            Evento evento) {

        this.id=id;
        this.participante=participante;
        this.evento=evento;
        this.status="Confirmada";
    }

    public void confirmar() {
        System.out.println(
        "Inscrição confirmada");
    }

    public void cancelar() {
        status="Cancelada";
    }

    public String getStatus() {
        return status;
    }
}