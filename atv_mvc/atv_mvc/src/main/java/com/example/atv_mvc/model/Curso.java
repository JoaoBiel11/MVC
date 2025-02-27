package com.example.atv_mvc.model;

import java.util.ArrayList;

public class Curso {

    private Long idcurso;
    private String nome;
    private int numerosala;
    private ArrayList <Aluno> alunos;
    private Professor professor;

    public Curso(Long idcurso, String nome, int numerosala, ArrayList<Aluno> alunos, Professor professor) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.numerosala = numerosala;
        this.alunos = alunos;
        this.professor = professor;
    }

    public Long getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Long idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumerosala() {
        return numerosala;
    }

    public void setNumerosala(int numerosala) {
        this.numerosala = numerosala;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
