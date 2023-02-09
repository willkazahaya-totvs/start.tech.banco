package br.com.totvs.start.tech.banco.entity;

public class Cliente {

    private String id;
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome, String cpf, String profissao, String id) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.id = id;
    }

    

    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
