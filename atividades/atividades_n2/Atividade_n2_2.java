package atividades.atividade_n2;

import java.util.Scanner;

public class Atividade_n2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite o primeiro valor: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;
        System.out.println("A média dos dois números é: " + media);
    }
}
