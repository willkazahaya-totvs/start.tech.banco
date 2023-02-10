package br.com.totvs.start.tech.banco.service;

import br.com.totvs.start.tech.banco.entity.Cliente;

public class ClienteServiceImpl implements ClienteService{

    public Cliente criarCliente(String nome, String cpf, String profissao, String id){
        Cliente clienteCria = new Cliente();

        clienteCria.setNome(nome);
        clienteCria.setCpf(cpf);
        clienteCria.setProfissao(profissao);
        clienteCria.setId(0);

        return clienteCria;
    }
}
