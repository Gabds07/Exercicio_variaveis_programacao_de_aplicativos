public class Main {
    public static void main() {
        Iphone iphone[] = {
            new AparelhoTelefonico("719293921"),
            new ReprodutorMusical("Sienna - The Marías"),
            new NavegadorInternet("youtube.com", "Google Chrome")
        };

        iphone[0].ligar("71932189391");
        iphone[0].atender();
        iphone[0].iniciarCorreioVoz();

        iphone[1].tocar();
        iphone[1].pausar();
        iphone[1].selecionarMusica("No one notice - The marías");

        iphone[2].exibirPagina("youtube.com");
        iphone[2].adicionarNovaAba();
        iphone[2].atualizarPagina();
        
    }
}
