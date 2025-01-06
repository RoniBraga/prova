package br.edu.prova.model;


import java.util.Optional;
import java.util.UUID;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name="documento")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Long nrDocumento;
    private String tpDocumento;
    @ManyToOne
    private Pessoa pessoa;

   public Documento(){

   }
    
    public Documento(UUID id, Long nrDocumento, String tpDocumento, Pessoa pessoa) {
    this.id = id;
    this.nrDocumento = nrDocumento;
    this.tpDocumento = tpDocumento;
    this.pessoa = pessoa;
}
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Long getNrDocumento() {
        return nrDocumento;
    }
    public void setNrDocumento(Long nrDocumento) {
        this.nrDocumento = nrDocumento;
    }
    public String getTpDocumento() {
        return tpDocumento;
    }
    public void setTpDocumento(String tpDocumento) {
        this.tpDocumento = tpDocumento;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
   
 

   /* public Pessoa getPessoa() {
        return pessoa;
    }




    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
 */
   
    
}
