package br.com.totvs.start.tech.banco.entity;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String rg;

    public Cliente() {

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

    public String getrg() {
        return rg;
    }

    public void setProfissao(String profissao) {
        this.rg = profissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
