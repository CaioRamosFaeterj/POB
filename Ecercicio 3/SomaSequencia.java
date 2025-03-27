import java.util.Scanner;

public class SomaSequencia {
    public static void main(String[] args) {
        int n,i,s = 0;
        System.out.print("Digite o número: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (i = 0;i <= n;i++)
        {
            s += i;
        }
        System.out.println(s);
        scanner.close();
    }
} 