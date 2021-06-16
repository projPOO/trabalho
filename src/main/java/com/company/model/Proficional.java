/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Dokuv
 */
@Entity
@Table(name = "proficional")
@NamedQueries({
    @NamedQuery(name = "Proficional.findAll", query = "SELECT p FROM Proficional p")})
public class Proficional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpro")
    private Integer idpro;
    @Size(max = 45)
    @Column(name = "nome")
    private String nome;
    @Size(max = 45)
    @Column(name = "idade")
    private String idade;
    @Size(max = 45)
    @Column(name = "crm")
    private String crm;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proficional")
    private List<PessoaHasProficional> pessoaHasProficionalList;

    public Proficional() {
    }

    public Proficional(Integer idpro) {
        this.idpro = idpro;
    }

    public Integer getIdpro() {
        return idpro;
    }

    public void setIdpro(Integer idpro) {
        this.idpro = idpro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<PessoaHasProficional> getPessoaHasProficionalList() {
        return pessoaHasProficionalList;
    }

    public void setPessoaHasProficionalList(List<PessoaHasProficional> pessoaHasProficionalList) {
        this.pessoaHasProficionalList = pessoaHasProficionalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpro != null ? idpro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proficional)) {
            return false;
        }
        Proficional other = (Proficional) object;
        if ((this.idpro == null && other.idpro != null) || (this.idpro != null && !this.idpro.equals(other.idpro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.Proficional[ idpro=" + idpro + " ]";
    }
    
}
