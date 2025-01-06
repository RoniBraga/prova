package br.edu.prova.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.prova.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, UUID>{
    
}
