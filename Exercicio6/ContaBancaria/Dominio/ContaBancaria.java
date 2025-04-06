package Exercicio6.ContaBancaria.Dominio;


public class ContaBancaria {
    String titular;
    Double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Foi depositado " + String.format("%.2f",valor) + "R$ na sua conta");
    }
    public void sacar(double valor){
        this.saldo -= valor;
        System.out.println("Foi sacado " + String.format("%.2f",valor) + "R$ da sua conta");
    }
    public void exibirSaldo(){
        System.out.println("Saldo: " + String.format("%.2f",this.saldo));
    }
}
