
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel");
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        int i = 0;

        while(i < notas.length) {
            System.out.print("Digite as notas: ");
            notas[i] = scanner.nextDouble();

            if(notas[i] > 0 && notas[i] < 10) {
                aluno.setNotas(notas);
            } else {
                System.out.println("Nota inválida, tente novamente.");
                continue;
            }
            i++;
        }
        
        for(double n : aluno.getNotas()) {
            System.out.println(n);
        }

        double media = aluno.calcularMedia();
        aluno.resultado(media);
    }
}
