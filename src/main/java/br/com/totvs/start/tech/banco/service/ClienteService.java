package br.com.totvs.start.tech.banco.service;

import br.com.totvs.start.tech.banco.entity.Cliente;

public interface ClienteService {
    
    public Cliente criarCliente(String nome, String cpf, String profissao, String id);


}
