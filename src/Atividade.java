public class Atividade {

    private String nome;
    private String tipo;

    public Atividade(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void exibir() {
        System.out.println("Atividade: " + nome);
        System.out.println("Tipo: " + tipo);
    }

    public String getNome() {
        return nome;
    }
}