package Exercicio4;
import Outros.Inserir;

public class MaiorMenor {
    public static void main(String[] args){

    float maior = Integer.MIN_VALUE,menor = Integer.MAX_VALUE;
    float vetor[] = Inserir.arrayFloat(5);

    for (float i : vetor){
        maior = maior < i ? i : maior;
        menor = menor > i ? i : menor;
    }
    System.out.println("o maior numero do array é:" + maior);
    System.out.println("o maior numero do array é:" + menor);
    }
}
