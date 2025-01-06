package br.edu.prova.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.prova.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {
    
}
