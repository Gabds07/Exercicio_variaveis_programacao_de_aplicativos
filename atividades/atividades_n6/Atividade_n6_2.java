package atividades.atividade_n6;

import java.util.Scanner;

public class Atividade_n6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double n1, n2;

        System.out.print("Digite o nome do aluno: ");
        nome = scanner.next();
        System.out.print("Digite a primeira nota do aluno: ");
        n1 = scanner.nextInt();
        System.out.print("Digite a segunda nota do aluno: ");
        n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println("O aluno " + nome + ", sua média ficou: " + media);
    }
}
