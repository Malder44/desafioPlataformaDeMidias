package borges.leonorico.desafioPlataformaDeMusicas.midias;

public class Musica extends Audio{

    private String genero;
    private String banda;
    private String album;
    private int anoDeLancamento;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public void exibeInformacoes() {
        System.out.println("Nome da música: " + this.getTitulo());
        System.out.println("Banda: " + this.getBanda());
        System.out.println("Álbum: " + this.getAlbum());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Duração: " + this.getDuracaoEmMinutos() + " minutos");
        super.exibeInformacoes();
    }
}
