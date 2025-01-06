package br.edu.prova.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.prova.model.Documento;
import br.edu.prova.model.Pessoa;
import br.edu.prova.repository.DocumentoRepository;
import br.edu.prova.repository.PessoaRepository;

@Controller
public class DocumentoController {
    private DocumentoRepository documentoRepository;
    private PessoaRepository pessoaRepository;

    public DocumentoController(DocumentoRepository documentoRepository, PessoaRepository pessoaRepository){
        this.documentoRepository = documentoRepository;
        this.pessoaRepository = pessoaRepository;
    }
    @GetMapping("/formDocumento")
    public String formPessoa(Model model){
        return"documento/formDocumento";
    }
    @GetMapping("/cadastrar-documento/{id}")
    public String exibirFormulario(@PathVariable UUID id, Model model) {
        // Buscar a pessoa pelo id e passar para o modelo
        Pessoa pessoa = pessoaRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Pessoa não encontrada"));
        
        model.addAttribute("pessoa", pessoa);
        model.addAttribute("id", id);  // Passar o id para o formulário
        return "documento/formDocumento";  // Página com o formulário
    }
    
    @PostMapping("/cadastroDocumento")
    public String salvarDocumento(Documento documento, Model model){
   
    documentoRepository.save(documento);
    
    return "redirect:/";
    }

}
