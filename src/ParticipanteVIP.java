public class ParticipanteVIP extends Participante {

    public ParticipanteVIP(String nome, String email, String tipoParticipacao) {
        super(nome, email, tipoParticipacao);
    }

    @Override
    public void exibirDados() {

        System.out.println("===== PARTICIPANTE VIP =====");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Tipo: VIP - " + getTipoParticipacao());
    }
}