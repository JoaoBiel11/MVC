package com.example.atv_mvc.model;

public class Professor {

    private Long idprof;
    private String nome;
    private String cpf;
    private double salario;

    public Professor(Long idprof, String nome, String cpf, double salario) {
        this.idprof = idprof;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Long getIdprof() {
        return idprof;
    }

    public void setIdprof(Long idprof) {
        this.idprof = idprof;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
