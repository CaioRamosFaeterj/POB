import java.util.Scanner;
public class esfera{
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insria o raio da esfera:");
        double raio = scan.nextDouble();
        double volume = (4/3) * Math.PI * Math.pow(raio,3);
        System.out.println("o volume do circulo é de: " + volume);
        scan.close();
    }
}
