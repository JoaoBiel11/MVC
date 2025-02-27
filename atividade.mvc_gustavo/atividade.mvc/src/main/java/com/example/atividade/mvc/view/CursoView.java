package com.example.atividade.mvc.view;

import com.example.atividade.mvc.controller.CursoController;
import com.example.atividade.mvc.model.Aluno;
import com.example.atividade.mvc.model.Curso;
import com.example.atividade.mvc.model.Professor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoView {

    CursoController cursoController = new CursoController();

    @GetMapping
    public List<Curso> getAll(){
        return cursoController.getAll();
    }

    @GetMapping("/{id}")
    public Curso getById(@PathVariable Long id){
        return cursoController.getById(id);
    }
    //BUSCAR SALA

    @GetMapping("/numeroSala/{numeroSala}")
    public Curso getByRoom(@PathVariable int numeroSala){
        return cursoController.getByRoom(numeroSala);
    }

    //BUSCAR POR NOME
    @GetMapping("/buscarNome/{nome}")
    public Curso getByName(@PathVariable String nome){
        return cursoController.getByName(nome);
    }


    @PostMapping
    public boolean insert (@RequestBody Curso curso) {
        return cursoController.insert(curso);
    }
    //ATUALIZAR POR ID
    @PutMapping("/{id}")
    public Curso update(@RequestBody Curso curso, @PathVariable Long id) {
        return cursoController.update(id, curso);
    }

    @DeleteMapping("/{id}")
    public boolean delete ( @PathVariable Long id){
        return cursoController.delete(id);
    }

    @PostMapping("/inserirestudante/{cursoNome}")
    public boolean insertestudante(@PathVariable String cursoNome, @RequestBody Aluno aluno){
        return cursoController.insertestudante(cursoNome, aluno);
    }

}
