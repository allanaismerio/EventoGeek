public class Participante extends Pessoa implements Exibivel {

    private String tipoParticipacao;

    public static final String EVENTO = "Evento Geek";

    public Participante(String nome, String email, String tipoParticipacao) {

        super(nome, email);

        this.tipoParticipacao = tipoParticipacao;
    }

    public String getTipoParticipacao() {
        return tipoParticipacao;
    }

    public void setTipoParticipacao(String tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    @Override
    public void exibirDados() {

        System.out.println("===== PARTICIPANTE =====");
        System.out.println("Evento: " + EVENTO);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Tipo: " + tipoParticipacao);
    }

    // Sobrecarga
    public void cadastrar(String nome) {
        System.out.println("Participante " + nome + " cadastrado.");
    }

    public void cadastrar(String nome, String email) {
        System.out.println("Participante " + nome + " cadastrado com email " + email);
    }
}