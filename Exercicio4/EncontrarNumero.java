package Exercicio4;
import java.util.Scanner;

import Outros.Inserir;

public class EncontrarNumero {
    public static void main(String[] args){

    float vetor[] = Inserir.arrayFloat(10,false);
    System.out.println("insira o numero que queria procurar:");
    Scanner s = new Scanner(System.in);
    float num = s.nextFloat();
    s.close();
    for (int i = 0 ; i < vetor.length ; i++){
        if (vetor[i] == num){
            System.out.println("valor " + num + " encontrado em " + i);
            return;
        }
    }
    System.out.println("valor não encontrado");
    }
}
