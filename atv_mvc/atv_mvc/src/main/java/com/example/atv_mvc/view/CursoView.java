package com.example.atv_mvc.view;

import com.example.atv_mvc.controller.CursoController;
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

        @GetMapping("/{id}")
        public Curso getIdcurso(@PathVariable Long id) {
            return CursoController.getIdcurso(id);
        }

        //@GetMapping("/{nome}")
       // public Curso getNome(@PathVariable String nome) {
        //return CursoController.getNome(nome);
         }

        @PostMapping
        public boolean insertBanco(@RequestBody Curso curso) {
            return CursoController.insertBanco(curso);
        }

        @PutMapping ("/{id}")
        public Curso update(@RequestBody Curso curso, @PathVariable int id) {
            return CursoController.update(id, curso);
        }
    }

