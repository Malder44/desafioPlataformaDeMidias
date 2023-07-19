package malder.desafioPlataformaDeMusicas.midias;

public class Audio {

    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducoes;
    private int numeroDeCurtidas;
    private int classificacao;
    private boolean favorito;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void reproduzir() {
        totalDeReproducoes++;
    }

    public void curtir() {
        numeroDeCurtidas++;
    }

    public void favoritar() {
        favorito = true;
    }

    public void exibeInformacoes() {
        System.out.println("Nome do áudio: " + this.getTitulo());
        System.out.println("Duração do áudio: " + this.getDuracaoEmMinutos() + " segundos");
        System.out.println("Número de reproduções do áudio: " + this.getTotalDeReproducoes());
        System.out.println("Número de curtidas do áudio: " + this.getNumeroDeCurtidas());
        System.out.println("Nota do áudio: " + this.getClassificacao() + "/10");
    }

    //TODO: Futuramente criar os métodos compartilhar, guardar no álbum...
}
