public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNotas(double n[]) {
        this.notas = new double[3];
        for(int i = 0; i < this.notas.length; i++) {
            this.notas[i] = n[i];
        }
    }

    public double[] getNotas() {
        return this.notas;
    }

    public double calcularMedia() {
        double media = 0;
        for(int i = 0; i < this.notas.length; i++) {
            media += this.notas[i];
        }
        media = media / this.notas.length;
        System.out.println("O nome do aluno é: " + this.nome + ", a quantidade de notas: " + this.notas.length + ", A média do aluno é: " + media);
        return media;
    }

    public void resultado(double media) {
        if(media >= 7) {
            System.out.println("Aluno aprovado!!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
