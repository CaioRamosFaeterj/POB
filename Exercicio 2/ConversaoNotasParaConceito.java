import java.util.Scanner;

public class ConversaoNotasParaConceito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma nota (0 a 10): ");
        int nota = scanner.nextInt();
        
        switch (nota) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            case 4:
            case 3:
                System.out.println("D");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("E");
                break;
            default:
                System.out.println("Nota inválida.");
        }
        
        scanner.close();
    }
}