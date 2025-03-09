import java.util.Scanner;

public class Salario {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insria o salario bruto:");
        int salario = scan.nextInt();
        System.out.println("Insria o valor a ser descontado:");
        int desconto = scan.nextInt();
        int resultado =  salario - desconto;
        System.out.println("o salario liquido tem um valor de: " + resultado);
        scan.close();
    }
}