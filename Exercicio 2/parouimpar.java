import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira um numero:");
    int n = scan.nextInt();
    if (n % 2 == 1 ){
        System.out.println("O numero é impar");
    } else {
        System.out.println("O numero é par");
    }
    scan.close();
}
}
