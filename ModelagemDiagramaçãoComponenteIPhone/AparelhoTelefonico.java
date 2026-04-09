public class AparelhoTelefonico extends Iphone {
    private String numero;

    public AparelhoTelefonico() {
    }

    public AparelhoTelefonico(String numero) {
        this.numero = numero;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
