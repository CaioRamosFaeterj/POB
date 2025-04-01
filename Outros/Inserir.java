package Outros;

import java.util.Scanner;

public class Inserir {
    public static float[] arrayFloat(int quant) {
        Scanner scanner = new Scanner(System.in);
        float[] vetor = new float[quant];
        for (int i = 0; i < quant;i++)
        {
            System.out.println("Insira o " + (i + 1) + "º numero:");
            vetor[i] = scanner.nextFloat();
        }
        scanner.close();
        return vetor;
    }
    
    public static float[] arrayFloat(int quant,boolean close) {
        Scanner scanner = new Scanner(System.in);
        float[] vetor = new float[quant];
        for (int i = 0; i < quant;i++)
        {
            System.out.println("Insira o " + (i + 1) + "º numero:");
            vetor[i] = scanner.nextFloat();
        }
        if (close)
        scanner.close();

        return vetor;
    }
}
