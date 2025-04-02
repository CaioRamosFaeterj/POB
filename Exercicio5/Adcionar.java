package Exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Adcionar{
    public static void main (String[] args){
        ArrayList<Integer> array= new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Insira um numero, ou \"p\" para parar");
            String valor = scanner.nextLine();
            if (valor.equalsIgnoreCase("p")){
                break;
            }
            try{
                int numero = Integer.parseInt(valor);
                array.add(numero);
            }catch(NumberFormatException e)
            {
                System.out.println("Valor invalido");
            }
        }while(true);
        System.out.println("Números digitados:");
        for (int numero : array) {
            System.out.println(numero);
        }
        scanner.close();
    }
    
}