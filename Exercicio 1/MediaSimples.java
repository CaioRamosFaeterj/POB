import java.util.Scanner;
public class MediaSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o prieiro valor:");
        double n1 = scan.nextDouble();
        System.out.println("Insira o segundo valor:");
        double n2 = scan.nextDouble();
        System.out.println("Insira o terceiro valor:");
        double n3 = scan.nextDouble();
        double resultado = (n1 + n2 + n3) / 3;
        System.out.println("resultado da media: " + resultado);
        scan.close();
    }
}