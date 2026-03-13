public class Animal {
    private String nome;
    private double peso;

    Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void mostrarAnimal() {
        System.out.println("Nome do animal: " + this.nome + ", peso do animal: " + this.peso + " Kg");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
