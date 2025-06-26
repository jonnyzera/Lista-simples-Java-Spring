package br.com.listassimples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import br.com.listassimples.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TarefaController {

    private List<Tarefa> tarefas = new ArrayList<>();

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("tarefas", tarefas);
        return "lista";
    }

    @PostMapping("/adicionar")
    public String adicionar(@RequestParam String nome) {
        tarefas.add(new Tarefa(nome));
        return "redirect:/";
    }

    @GetMapping("/remover/{index}")
    public String remover(@PathVariable int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        }
        return "redirect:/";
    }
}
