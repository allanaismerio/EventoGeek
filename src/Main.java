public class Main {

    public static void main(String[] args) {

        try {

            Evento evento =
                    new Evento("Geek Experience 2026");

            Participante p1 =
                    new Participante(
                            "Allana",
                            "allana@email.com",
                            "Cosplay"
                    );

            Participante p2 =
                    new Participante(
                            "Carlos",
                            "carlos@email.com",
                            "Palestra"
                    );

            ParticipanteVIP vip =
                    new ParticipanteVIP(
                            "Jayana",
                            "jayana@email.com",
                            "Games"
                    );

            evento.adicionarParticipante(p1);
            evento.adicionarParticipante(p2);
            evento.adicionarParticipante(vip);

            evento.exibirParticipantes();

        } catch (Exception e) {

            System.out.println("Erro no sistema: " + e.getMessage());
        }
    }
}