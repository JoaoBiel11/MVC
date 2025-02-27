package com.example.atv_mvc.model;

public class Aluno {

    private Long idaluno;

    private String nome;

    private String cpf;

    public Aluno(Long id, String nome, String cpf) {
        this.idaluno = idaluno;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(Long id) {
        this.idaluno = id;
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
}
