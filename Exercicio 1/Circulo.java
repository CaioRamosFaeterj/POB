import java.util.Scanner;

public class Circulo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor do raio:");
        double raio = scan.nextDouble();
        double resultado = Math.PI * Math.pow(raio, 2);
        System.out.println(resultado);
        scan.close();
    }
}