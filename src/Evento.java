import java.util.ArrayList;

public class Evento implements Exibivel {

    private int id;
    private String nome;
    private String data;
    private String local;

    private int capacidade;

    private double precoIngresso;

    private ArrayList<Atividade> atividades;

    public Evento(
            int id,
            String nome,
            String data,
            String local,
            int capacidade,
            double precoIngresso
    ){

        this.id=id;
        this.nome=nome;
        this.data=data;
        this.local=local;
        this.capacidade=capacidade;
        this.precoIngresso=precoIngresso;

        atividades = new ArrayList<>();
    }

    public void adicionarAtividade(
            Atividade atividade){

        atividades.add(atividade);
    }

    @Override
    public void exibir(){

        System.out.println(nome);

        for(Atividade a:atividades){

            a.exibir();

        }

    }
}