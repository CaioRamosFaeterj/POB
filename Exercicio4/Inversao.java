package Exercicio4;
import Outros.Inserir;

public class Inversao {
    public static void main(String[] args){

    float vetor[] = Inserir.arrayFloat(6);
    System.out.print("Ordem normal:");
    for (float i : vetor){
        System.out.print(i + ", ");
    }
    System.out.print("\nOrdem invertida:");
    for (int i = vetor.length - 1; i > 0;i--){
        System.out.print(vetor[i] + ", ");
    }
    }
}
