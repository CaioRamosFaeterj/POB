import java.util.Scanner;

public class Conversão{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insria a temperatura em Celsius");
        double Celsius = scan.nextDouble();
        double resultado = (Celsius * 9/5) + 32;
        System.out.println(resultado);
        scan.close();
    }
}