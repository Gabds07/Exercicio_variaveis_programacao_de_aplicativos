package atividades.atividade_n2;

import java.util.Scanner;

public class Atividade_n2_3 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int quantidade;
        double valorProduto, total;

        System.out.print("Digite o valor do produto: ");
        valorProduto = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        quantidade = scanner.nextInt();

        total = valorProduto*quantidade;
        System.out.println("O total do produto será: " + total);
    }
}
