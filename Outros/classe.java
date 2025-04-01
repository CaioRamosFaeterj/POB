package Outros;
import java.util.Scanner;

public class classe {
     public static void main(String[] args){
        int teste = 300;
        Scanner scan = new Scanner(System.in);
        while (teste != 0) {
            System.out.println("\n[0]encerrar \n[1]adcionar uma pessoa \n[2]listar pessoas");
            teste = scan.nextInt();
            scan.nextLine();
            switch (teste) {
                case 1:
                    addPessoa();
                break;
                case 2:
                    listaPessoas();
                break;
                default:
                    System.out.println("valor invalido");
                break;
            }
        }
        scan.close();
    }
    private static void addPessoa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um nome");
        String nome = scan.nextLine();
        System.out.println("Insira o dinheiro");
        float dinheiro = scan.nextFloat();
        new Pessoa(nome, dinheiro);
        System.out.println("Pessoa criada");
        scan.close();
    }
    private static void listaPessoas()
    {

    }
}