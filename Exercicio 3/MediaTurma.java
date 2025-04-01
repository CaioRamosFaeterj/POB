import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de alunos:");
        int quantidadeAlunos = scanner.nextInt();
    
        if (quantidadeAlunos <= 0) {
            System.out.println("A quantidade de alunos deve ser maior que zero.");
            scanner.close();
            return;
        }
        
        double somaNotas = 0;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }
        
        // Calcula e exibe a média
        double media = somaNotas / quantidadeAlunos;
        System.out.printf("A média da turma é:" + media);
        
        scanner.close();
    }
}