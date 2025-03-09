import java.util.Scanner;
public class retangulo{
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insria a base do rentangulo:");
        double base = scan.nextDouble();
        System.out.println("Insria a altura do triangulo");
        double altura = scan.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("area: " + area +" perimetro: " + perimetro);
        scan.close();
    }
}
