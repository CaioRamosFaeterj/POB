import java.util.Scanner;

public class AcharPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número do intervalo (início): ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número do intervalo (fim): ");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }
        System.out.println("Números primos no intervalo de " + n1 + " a " + n2 + ":");
        for (int numero = n1; numero <= n2; numero++) {
            boolean Primo = true;
            if (numero <= 1) {
                Primo = false;
            }
            else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        Primo = false;
                        break;
                    }
                }
            }
            if (Primo) {
                System.out.print(numero + " ");
            }
        }
        scanner.close();
    }
}
