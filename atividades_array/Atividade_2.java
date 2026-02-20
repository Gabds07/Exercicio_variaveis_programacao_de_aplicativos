package atividades.arrays;

import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0, valores = 0, soma = 0, indices = 0;

        System.out.print("Quantos números deseja digitar? ");
        indices = scanner.nextInt();
        int[] nums = new int[indices];
        
        while(i < nums.length) {
            System.err.print("Digite um valor: ");
            try {   
                valores = scanner.nextInt();
                nums[i] = valores;
                if(nums[i] % 2 == 0) {
                    soma += nums[i];
                }
            } catch (Exception e) {
                System.out.println("Digite um valor válido. Tente novamente");
                scanner.nextLine();
                continue;
            }
            i++;
        }
        System.out.println("Soma dos números pares: " + soma);
    }
}
