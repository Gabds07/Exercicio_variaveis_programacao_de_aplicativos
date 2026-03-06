public class Carro {
    private String marca;
    private int velociadeAtual = 0;
    private int velocidadeMaxima;

    public Carro(String marca, int velocidadeAtual, int velocidadeMaxima) {
        this.marca = marca;
        this.velociadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(int valor) {
        
            this.velociadeAtual += valor;

            if(this.velociadeAtual <= this.velocidadeMaxima && valor > 0) {
                System.out.println("Velocidade atual: " + this.velociadeAtual + " km/h");
            }
         else {
            System.out.println("Não foi possível acelerar mais, velocidade máxima atingida. Ou valor é menor ou igual à zero.");
            this.velociadeAtual -= valor;
        }
    }

    public void frear(int valor) {
        if(valor <= this.velociadeAtual) {
            this.velociadeAtual -= valor;
            System.out.println("Velocidade atual: " + this.velociadeAtual + " km/h");
        } else {
            System.out.println("Não foi possível frear, valor maior que a velocidade atual.");
        }
    }

    public int getVelocidadeAtual() {
        return this.velociadeAtual;
    }

    public int getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }
}
