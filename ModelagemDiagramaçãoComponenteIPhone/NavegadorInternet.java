public class NavegadorInternet extends Iphone {
    private String urlPagina;
    private String nomeNavegador;

    public NavegadorInternet() {

    }
    
    public NavegadorInternet(String urlPagina, String nomeNavegador) {
        this.urlPagina = urlPagina;
        this.nomeNavegador = nomeNavegador;
    }

    @Override
    public void exibirPagina(String urlPagina) {
        this.urlPagina = urlPagina;
        System.out.println("Página aberta." + this.urlPagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }

    public String getNomeNavegador() {
        return this.nomeNavegador;
    }

    public void setNomeNavegador(String nomeNavegador) {
        this.nomeNavegador = nomeNavegador;
    }

    public String getUrlPagina() {
        return this.urlPagina;
    }
}
