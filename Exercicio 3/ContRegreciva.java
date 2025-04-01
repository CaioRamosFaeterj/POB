import java.util.Scanner;

public class ContRegreciva {
    public static void main(String[] args) {
        int n,i;
        System.out.print("Digite o número: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (i = n;i >= 0;i--)
        {
            System.out.println(i);
        }
        scanner.close();
    }
} 