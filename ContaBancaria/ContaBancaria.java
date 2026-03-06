public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Valor depositado, saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Não foi possível realizar depósito. Valor menor ou igual a zero.");
        }
    }

    public void sacar(double valor) {

        if(valor <= this.saldo) {
            this.saldo -= valor;

            int cedulas_100 = (int)valor / 100;
            int cedulas_50 = ((int)valor % 100) / 50;
            int cedulas_20 = ((int)valor % 50) / 20;
            int cedulas_10 = ((int)valor % 50) / 10;
            int cedulas_5 = ((int)valor % 10) / 5;
            int cedulas_1 = ((int)valor % 5);

            System.out.println("Você terá que usar: " 
            + cedulas_100 + " cédulas de R$100, " 
            + cedulas_50 + " cédulas de R$50, "
            + cedulas_20 + " cédulas de R$20, "
            + cedulas_10 + " cédulas de R$10, " 
            + cedulas_5 + " cédulas de R$5, " 
            + cedulas_1 + " cédulas de R$1.");
        } else {
            System.out.println("Não foi possível realizar saque, valor maior que o disponível no saldo da conta.");
        }
    }
}
