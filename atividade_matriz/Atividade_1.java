package atividades.matriz;

import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int valores = 0;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um valor para preencher a matriz: ");
                valores = scanner.nextInt();
                matriz[i][j] = valores;
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
