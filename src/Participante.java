import java.util.ArrayList;

public class Participante extends Pessoa {

    private ArrayList<Inscricao> inscricoes;

    public Participante(
            String nome,
            String email){

        super(nome,email);

        inscricoes = new ArrayList<>();
    }

    public void inscrever(Evento evento){

        Inscricao nova=
        new Inscricao(
                inscricoes.size()+1,
                this,
                evento
        );

        inscricoes.add(nova);

        System.out.println(
        "Inscrito com sucesso!");
    }

}