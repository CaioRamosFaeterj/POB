import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        int n1,n2 =  0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira um numero");
        n1 = scanner.nextInt();
        while (n2 <= 10) {
            System.out.println(n1 + "*" + n2 + "=" + (n1*n2) );
            n2 += 1;
        }
        scanner.close();
    }
}
