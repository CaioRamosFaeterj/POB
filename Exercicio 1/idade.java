import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insria a sua idade");
        int idade = scan.nextInt();
        int resultado = idade * 365;
        System.out.println("no seu aniversario você tinha aproximadamente: " + resultado + " dias de vida");
        scan.close();
    }
}
