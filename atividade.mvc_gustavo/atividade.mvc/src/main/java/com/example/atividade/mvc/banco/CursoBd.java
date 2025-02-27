package com.example.atividade.mvc.banco;

import com.example.atividade.mvc.model.Curso;
import com.example.atividade.mvc.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class CursoBd {

    private List<Curso> cursos;
    private List<Professor> professores;

    public CursoBd(){
        this.cursos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }
    //buscar todos
    public List<Curso> findAll(){
        return new ArrayList<>(cursos);
    }
    //buscar curso por ID
    public Curso getById(Long id){
        return cursos.stream()
                .filter(dep -> dep.getId() == id)
                .findFirst()
                .orElse(null);
    }
    //BUSCAR POR SALA
    public Curso getByRoom(int numeroSala){
        return cursos.stream()
                .filter(c -> c.getNumeroSala() == numeroSala)
                .findFirst()
                .orElse(null);
    }

   // BUSCAR POR NOME
    public Curso getByName(String nome){
        return cursos.stream()
                .filter(c -> c.getProfessor().getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    //inserir curso
    public boolean insert (Curso curso){
        cursos.add(curso);
        return true;
    }
    //remover curso
    public boolean delete (Long id){
        Curso d = cursos.stream()
                .filter(dBd -> dBd.getId() == id)
                .findFirst()
                .orElse(null);

        if(d == null){
            return false;
        }
        cursos.remove(d);
        return true;
    }
    // atualizar curso

    public boolean update (Long id, Curso curso){
        Curso cursoBd = cursos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);

        if(cursoBd == null){
            return false;
        }
        cursoBd.setNome(curso.getNome());
        return true;
    }


}
