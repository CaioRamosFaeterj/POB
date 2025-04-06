package Exercicio6.ContaBancaria.Controle;

import java.util.Scanner;

import Exercicio6.ContaBancaria.Dominio.ContaBancaria;

public class GerenciadorConta {
    public static void main(String args[])  {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o seu nome para criar a conta");
        String nome = scanner.nextLine();
        ContaBancaria conta = new ContaBancaria(nome);
    do{
        System.out.println("\n=== MENU CONTA BANCÁRIA ===\n" +
            "1 - Depositar\n" +
            "2 - Sacar\n" +
            "3 - Consultar Saldo\n" +
            "0 - Sair\n" +
            "Escolha uma opção: ");
        int opcao = scanner.nextInt();
        double valor;
        switch (opcao) {
            case 0:
                continuar = false;
            break;
            case 1:
            System.out.println("Insira o valor:");
                valor = scanner.nextDouble();
                conta.depositar(valor);
            break;
            case 2:
            System.out.println("Insira o valor:");
                valor = scanner.nextInt();
                conta.sacar(valor);
            break;
            case 3:
                conta.exibirSaldo();
            break;

            default:
            break;
        }
        }while (continuar);
        scanner.close();
    }


}
