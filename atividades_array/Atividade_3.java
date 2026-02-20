package atividades.arrays;

import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = 0, n2 = 0, res = 0;
        String simbolo;
        String comando = null;
        boolean running = true;

        while(running) {
            try {
                System.out.print("Digite o primeiro valor: ");
                n1 = scanner.nextInt();
                System.out.print("Digite o segundo valor: ");
                n2 = scanner.nextInt();
                System.out.print("Digite a operação [+, -, *, /, **]");
                simbolo = scanner.next();

                switch(simbolo) {
                    case "+":
                        res = n1 + n2;
                        break;
                    case "-":
                        res = n1 - n2;
                        break;
                    case "*":
                        res = n1 * n2;
                        break;
                    case "/":
                        if(n2 == 0) {
                            System.out.println("Divisão não pode  ser realizada.");
                        } else {
                            res = n1 / n2;
                        }
                        break;
                    case "**":
                        res = Math.pow(n1, n2);
                        break;
                    default:
                        System.out.print("Digite uma operação válida.");
                }
                System.out.println("O resultado do cálculo é: " + res);
            } catch (Exception e) {
                System.out.println("Algo deu errado, tente novamente.");
                scanner.nextLine();
                continue;
            }
            System.out.print("Você deseja continuar? [CONTINUE, EXIT]: ");
            comando = scanner.next();
            if(comando.toLowerCase().contains("exit")) {
                running = false;
            }
        }
    }
}
