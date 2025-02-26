package com.example.atv_mvc.controller;

import com.example.atv_mvc.banco.CursoBd;
import com.example.atv_mvc.model.Aluno;
import com.example.atv_mvc.model.Curso;

import java.util.List;

public class CursoController {
    CursoBd cursorepository = new CursoBd();

    public List<Curso> getAll() {
        return cursorepository.findAll();
    }

    public Curso getIdcurso(Long id) {
        return cursorepository.getIdcurso(id);
    }

    public Curso getNome(String nome) {
        return cursorepository.getNome(nome);
    }

    public boolean insertBanco(Curso curso) {
        return cursorepository.insertBanco(curso);
    }

    public Curso update(int id, Curso curso) {
        boolean result = cursorepository.update(id, curso);

        if (result) {
            return curso;
        }
        return null;
    }

    public boolean delete(Long id) {
        return  cursorepository.delete(id);
    }

    public boolean insertestudante (String cursoNome, Aluno aluno){
        return cursorepository.insertestudante(cursoNome, aluno);
    }
}

