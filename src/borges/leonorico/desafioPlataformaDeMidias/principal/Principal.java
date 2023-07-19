package borges.leonorico.desafioPlataformaDeMidias.principal;

import borges.leonorico.desafioPlataformaDeMidias.midias.EpisodioPodcast;
import borges.leonorico.desafioPlataformaDeMidias.midias.Musica;

public class Principal {

    public static void main(String[] args) {

        Musica faixa1 = new Musica();
        faixa1.setBanda("Arctic Monkeys");
        faixa1.setAlbum("AM");
        faixa1.setTitulo("Do I Wanna Know");
        faixa1.setGenero("Rock Indie");
        faixa1.setAnoDeLancamento(2006);
        faixa1.setDuracaoEmMinutos(4);
        faixa1.exibeInformacoes();

        EpisodioPodcast episodio1 = new EpisodioPodcast();
        episodio1.setTitulo("A felicidade mora ao lado");
        episodio1.setNomePodcast("Contos de terror");
        episodio1.setNumeroEpisodio(65);
        episodio1.setAnoDeLancamento(2022);
        episodio1.setDuracaoEmMinutos(50);
        episodio1.exibeInformacoes();

        for(int i = 0; i < 30000; i++) {
            faixa1.reproduzir();
        }

        for(int i = 0; i < 110000; i++) {
            episodio1.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(faixa1);
        preferidas.inclui(episodio1);
    }
}
