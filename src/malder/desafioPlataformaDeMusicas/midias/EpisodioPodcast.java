package malder.desafioPlataformaDeMusicas.midias;

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
}
