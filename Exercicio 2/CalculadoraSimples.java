import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicita a operação desejada
        System.out.print("Digite a operação desejada (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida");
                operacaoValida = false;
        }

        // Exibe o resultado se a operação foi válida
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}