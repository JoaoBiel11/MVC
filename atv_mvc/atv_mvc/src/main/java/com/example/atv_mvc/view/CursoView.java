package com.example.atv_mvc.view;

import com.example.atv_mvc.controller.CursoController;
import com.example.atv_mvc.model.Aluno;
import com.example.atv_mvc.model.Curso;
import com.example.atv_mvc.model.Professor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/curso")
public class CursoView {

    CursoController CursoController = new CursoController();

    @GetMapping
    public List<Curso> getAll() {
        return CursoController.getAll();
    }

    @GetMapping("/idcurso/{id}")
    public Curso getIdcurso(@PathVariable Long id) {
        return CursoController.getIdcurso(id);
    }

    @GetMapping("/profnome/{nome}")
   public Curso getNome(@PathVariable String nome) {
   return CursoController.getNome(nome);
}

@PostMapping
    public boolean insertBanco(@RequestBody Curso curso) {

    return CursoController.insertBanco(curso);
}

@PutMapping ("/att/{id}")
public Curso update(@RequestBody Curso curso, @PathVariable Long id) {
    return CursoController.update(id, curso);
}

    @DeleteMapping("/delete/{id}")
    public boolean delete ( @PathVariable Long id){
        return CursoController.delete(id);
    }

    @PostMapping("/inserirestudante/{cursoNome}")
    public boolean insertestudante(@PathVariable String cursoNome, @RequestBody Aluno aluno){
        return CursoController.insertestudante(cursoNome, aluno);
    }

    @PutMapping("/atualizaraluno/{cursoNome}")
    public boolean attaluno(@PathVariable String cursoNome, @RequestBody Aluno aluno){
        return CursoController.attaluno(cursoNome, aluno);
    }
}

