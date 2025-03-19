import java.util.Scanner;

public class classificacao {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira uma idade:");
    int n = scan.nextInt();
    if (n < 18){
        System.out.println("menor de idade");
    } else if (n < 60){
        System.out.println("adulto");
    } else{
        System.out.println("idoso");
    }
    scan.close();
}
}
