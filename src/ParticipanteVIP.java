public class ParticipanteVIP
extends Participante{

    private String beneficios;

    public ParticipanteVIP(
            String nome,
            String email,
            String beneficios){

        super(nome,email);

        this.beneficios=beneficios;
    }

    public void acessoVip(){

        System.out.println(
        beneficios);

    }

}