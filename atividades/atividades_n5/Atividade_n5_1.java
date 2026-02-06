package atividades.atividade_n5;

import java.util.Scanner;

public class Atividade_n5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charValue;

        System.out.println("Digite um caractere: ");
        charValue = scanner.next().charAt(0);

        System.out.println("O char digitado foi: " + charValue);
    }
}
