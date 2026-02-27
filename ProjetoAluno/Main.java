import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Aluno[] alunos = new Aluno[5];

        for(int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            System.out.println();
            System.out.print("Digite o nome do aluno: ");
            alunos[i].setName(scanner.next());
            System.out.print("Digite a idade do aluno: ");
            alunos[i].setAge(scanner.nextInt());
            System.out.print("Digite a matrícula do aluno: ");
            alunos[i].setRegistration(scanner.next());
            System.out.println();
        }

        for(Aluno i : alunos) {
            System.out.println("Alunos registrados: ");
            System.out.println(i.getName() + ", " + i.getAge() + ", " + i.getRegistration() + ".");
        }
    }
}

