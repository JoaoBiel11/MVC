package com.example.atividade.mvc.model;

public class Professor {

    private Long idProf;
    private String nome;
    private String cpf;
    private double salario;

    public Professor(Long id, String nome, String cpf, double salario) {
        this.idProf = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Long getId() {
        return idProf;
    }

    public void setId(Long id) {
        this.idProf = id;
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
