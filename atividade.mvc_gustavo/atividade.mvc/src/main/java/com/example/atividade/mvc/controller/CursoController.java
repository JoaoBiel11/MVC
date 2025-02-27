package com.example.atividade.mvc.controller;

import com.example.atividade.mvc.banco.CursoBd;
import com.example.atividade.mvc.model.Aluno;
import com.example.atividade.mvc.model.Curso;
import com.example.atividade.mvc.model.Professor;

import java.util.List;

public class CursoController {

    CursoBd cursoRepository = new CursoBd();


    public List<Curso> getAll(){
        return cursoRepository.findAll();
    }

    public Curso getById(Long id){
        return cursoRepository.getById(id);
    }
    //BUSCAR SALA
    public Curso getByRoom(int numeroSala){
        return cursoRepository.getByRoom(numeroSala);
    }


    //BUSCAR POR NOME
    public Curso getByName(String nome){
        return cursoRepository.getByName(nome);
    }
    //INSERIR ESTUDANTE
    public boolean insertestudante (String cursoNome, Aluno aluno){
        return cursoRepository.insertestudante(cursoNome, aluno);
    }


    public boolean insert(Curso curso){
        return cursoRepository.insert(curso);
    }

    public Curso update (Long id , Curso curso){
        boolean result = cursoRepository.update(id, curso);

        if (result ){
            return curso;
        }

        return null;
    }

    public boolean delete (Long id ) {
        return cursoRepository.delete(id);

    }


}
