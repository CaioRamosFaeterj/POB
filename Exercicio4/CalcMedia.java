package Exercicio4;
import Outros.Inserir;

public class CalcMedia {
    public static void main(String[] args){

    float media = 0;
    float[] vetor = Inserir.arrayFloat(4);
    for (float i : vetor){
        media += i;
    }
    media /= vetor.length;
    System.out.println("A media do aluno é de:" + media + " logo está " + (media > 7 ? "aprovado" : "reprovado"));
    }
}
