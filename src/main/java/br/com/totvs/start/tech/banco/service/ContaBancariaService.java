package br.com.totvs.start.tech.banco.service;

import br.com.totvs.start.tech.banco.entity.Cliente;
import br.com.totvs.start.tech.banco.entity.ContaBancaria;

public interface ContaBancariaService {
    
    public ContaBancaria CriaConta(int agencia, int numero, Cliente titular);
    public ContaBancaria verficarSaldod(double saldo);
}
