import java.util.Scanner;

public class soma {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        double n = scan.nextDouble();
        System.out.println("Insira o psegundo valor:");
        n += scan.nextDouble();
        System.out.println("resultado:" + n);
        scan.close();
    }
}
