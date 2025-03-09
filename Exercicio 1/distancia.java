import java.util.Scanner;

public class distancia {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insria x1");
        double x1 = scan.nextDouble();
        System.out.println("Insria x2");
        double x2 = scan.nextDouble();
        System.out.println("Insria y1");
        double y1 = scan.nextDouble();
        System.out.println("Insria y2");
        double y2 = scan.nextDouble();
        double resultado = Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2));
        System.out.println("a distancia é de: " + resultado);
        scan.close();
    }
}
