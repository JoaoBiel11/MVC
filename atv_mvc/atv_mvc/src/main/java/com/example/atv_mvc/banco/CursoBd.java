package com.example.atv_mvc.banco;

import com.example.atv_mvc.controller.CursoController;
import com.example.atv_mvc.model.Aluno;
import com.example.atv_mvc.model.Curso;
import com.example.atv_mvc.model.Professor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

public class CursoBd {
    private List<Curso> cursos;

    public CursoBd(){
        this.cursos = new ArrayList<>();
    }

    // busca todos os cursos
    public List<Curso> findAll(){
        return new ArrayList<>(cursos);
    }

    // busca por id
    public Curso getIdcurso(Long id){
        return cursos.stream()
                .filter(c -> c.getIdcurso() == id)
                .findFirst()
                .orElse(null);
    }

    public Curso getNome(String nome){
        return cursos.stream()
                .filter(c -> c.getProfessor().getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    // insere o funcionário
    public boolean insertBanco(Curso curso){
        cursos.add(curso);
        return true;
    }

    //delete
    public boolean delete (Long id){
        Curso c = cursos.stream()
                .filter(cBd -> cBd.getIdcurso() == id)
                .findFirst()
                .orElse(null);

        if(c == null){
            return false;
        }
        cursos.remove(c);
        return true;
    }

    // atualiza o f com base no id
    public boolean update(Long id, Curso curso){
        Curso cursoBd = cursos.stream()
                .filter(f -> f.getIdcurso() == id)
                .findFirst()
                .orElse(null);

        if (cursoBd == null){
            return false;
        }

        cursoBd.setNome(curso.getNome());

        return true;
    }

    public boolean insertestudante(String cursoNome, Aluno aluno){
        Curso cursoBd = cursos.stream()
                .filter(f -> f.getNome().equals(cursoNome))
                .findFirst()
                .orElse(null);

        if (cursoBd == null){
            return false;
        }

        cursoBd.getAlunos().add(aluno);

        return true;
    }

    public boolean attaluno(Long cursoId, Aluno alunoAntigo, Aluno alunoNovo) {
        Curso cursoBd = cursos.stream()
                .filter(c -> c.getIdcurso() == cursoId)
                .findFirst()
                .orElse(null);

        if(alunoAntigo == null){
            return false;
        }
        if (cursoBd == null){
            return false;
        }

        alunoAntigo.setNome(alunoNovo.getNome());
        alunoAntigo.setCpf(alunoNovo.getCpf());

        return true;
    }

}