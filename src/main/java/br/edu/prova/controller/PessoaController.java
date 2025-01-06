package br.edu.prova.controller;



import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.prova.model.Documento;
import br.edu.prova.model.Pessoa;
import br.edu.prova.repository.DocumentoRepository;
import br.edu.prova.repository.PessoaRepository;


@Controller
public class PessoaController {

    private PessoaRepository pessoaRepository;
    private DocumentoRepository documentoRepository;
   

    public PessoaController(PessoaRepository pessoaRepository, DocumentoRepository documentoRepository){
        this.pessoaRepository = pessoaRepository;
        this.documentoRepository = documentoRepository;
    }

    @GetMapping("/formPessoa")
    public String formPessoa(Model model){
        return"pessoa/formPessoa";
    }
    @PostMapping("cadastroPessoa")
    public String salvarPessoa(Pessoa pessoa, Model model){
        pessoaRepository.save(pessoa);       
        return"redirect:/";
    }
    
    @GetMapping
    public String listAllPessoas(Model model){
       model.addAttribute("lista",pessoaRepository.findAll());
       model.addAttribute("listadoc", documentoRepository.findAll());
       return"index";
    }
}
