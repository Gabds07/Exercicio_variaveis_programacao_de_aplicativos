public class ReprodutorMusical extends Iphone {
    private String musica;

    public ReprodutorMusical() {
    }

    public ReprodutorMusical(String musica) {
        this.musica = musica;
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando: " + this.musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Música selecionada: " + this.musica);
    }

    public String getMusica() {
        return this.musica;
    }
}
