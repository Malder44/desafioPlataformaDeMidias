package borges.leonorico.desafioPlataformaDeMusicas.midias;

public class EpisodioPodcast extends Audio {

    private String nomePodcast;
    private int numeroEpisodio;
    private int anoDeLancamento;

    public String getNomePodcast() {
        return nomePodcast;
    }

    public void setNomePodcast(String nomePodcast) {
        this.nomePodcast = nomePodcast;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public void exibeInformacoes() {
        System.out.println("Nome do episódio: " + this.getTitulo());
        System.out.println("Nome do podcast: " + this.getNomePodcast());
        System.out.println("Número do episódio: " + this.getNumeroEpisodio());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Duração: " + this.getDuracaoEmMinutos() + " minutos");
        super.exibeInformacoes();
    }
}