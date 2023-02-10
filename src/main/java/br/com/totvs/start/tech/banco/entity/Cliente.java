package br.com.totvs.start.tech.banco.entity;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
