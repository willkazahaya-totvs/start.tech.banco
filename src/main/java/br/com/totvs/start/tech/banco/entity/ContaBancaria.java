package br.com.totvs.start.tech.banco.entity;



public class ContaBancaria {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    
    public ContaBancaria() {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean traferece(double valor,ContaBancaria localconta ){
        if(this.saldo >= valor){
            sacar(valor);
            localconta.depositar(valor);
            return true;
        }
            return false;
    }


    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int setAgencia(int agencia) {
        this.agencia = agencia;
        return this.agencia;
    }

    public int setNumero(int numero) {
        this.numero = numero;
        return this.numero;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public Cliente getTitular(String titular) {
        return this.titular;
    }

    public Cliente setTitular(String titular){
        return this.titular;
    }
}
