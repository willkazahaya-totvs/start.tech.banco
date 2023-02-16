package br.com.totvs.start.tech.banco.service;

import br.com.totvs.start.tech.banco.entity.Cliente;

public interface ClienteService {
    
    public Cliente criarCliente(String id, String nome, String cpf, String rg);


}
