import malder.desafioPlataformaDeMusicas.midias.Audio;

public class Principal {

    public static void main(String[] args) {

        Audio musica = new Audio();
        musica.setTitulo("Do I Wanna Know");
        musica.setDuracaoEmMinutos(231);
        musica.reproduzir();
        musica.curtir();
        musica.exibeInformacoes();
    }
}
