package br.edu.prova.model;

import java.util.List;
import java.util.UUID;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String email;
    private Long telefone;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Documento> documentos;

    public Pessoa(){

    }
    
       public Pessoa(UUID id, String nome, String email, Long telefone, List<Documento> documentos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.documentos = documentos;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getTelefone() {
        return telefone;
    }
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
    public List<Documento> getDocumentos() {
        return documentos;
    }
    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
   
    


       
}
