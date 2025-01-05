package br.edu.prova.model.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PessoaController {
    @RequestMapping("/pessoa")
    public String form(){
        return"pessoa/formPessoa";
    }
}
