public class AparelhoTelefonico {
    private String modelo;
    private String anoLancamento;

    public AparelhoTelefonico() {
    }

    public AparelhoTelefonico(String modelo, String anoLancamento) {
        this.modelo = modelo;
        this.anoLancamento = anoLancamento;
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Ligação atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getanoLancamento() {
        return this.anoLancamento;
    }

    public void setanoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
