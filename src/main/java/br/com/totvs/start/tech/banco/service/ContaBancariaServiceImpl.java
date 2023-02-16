package br.com.totvs.start.tech.banco.service;

import br.com.totvs.start.tech.banco.entity.Cliente;
import br.com.totvs.start.tech.banco.entity.ContaBancaria;

public class ContaBancariaServiceImpl implements ContaBancariaService{

    @Override
    public ContaBancaria CriaConta(int agencia, int numero, Cliente titular) {
        
        ContaBancaria contaNova = new ContaBancaria();
        
        contaNova.setAgencia(agencia);
        contaNova.setNumero(numero);
        contaNova.setTitular("");
        
        return contaNova;
    };

    public ContaBancaria verficarSaldod(double saldo){
        ContaBancaria saldoConta = new ContaBancaria();

        saldoConta.getSaldo();
        
        return saldoConta;
    }

    public ContaBancaria EncontraTitular(Cliente titular){
        ContaBancaria nomeTitular = new ContaBancaria();

        nomeTitular.getTitular("");

        return nomeTitular;
    }


}
