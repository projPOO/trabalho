/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Dokuv
 */
@Entity
@Table(name = "pessoa_has_proficional")
@NamedQueries({
    @NamedQuery(name = "PessoaHasProficional.findAll", query = "SELECT p FROM PessoaHasProficional p")})
public class PessoaHasProficional implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PessoaHasProficionalPK pessoaHasProficionalPK;
    @JoinColumn(name = "pessoa_idpe", referencedColumnName = "idpe", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pessoa pessoa;
    @JoinColumn(name = "proficional_idpro", referencedColumnName = "idpro", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Proficional proficional;

    public PessoaHasProficional() {
    }

    public PessoaHasProficional(PessoaHasProficionalPK pessoaHasProficionalPK) {
        this.pessoaHasProficionalPK = pessoaHasProficionalPK;
    }

    public PessoaHasProficional(int id, int pessoaIdpe, int proficionalIdpro) {
        this.pessoaHasProficionalPK = new PessoaHasProficionalPK(id, pessoaIdpe, proficionalIdpro);
    }

    public PessoaHasProficionalPK getPessoaHasProficionalPK() {
        return pessoaHasProficionalPK;
    }

    public void setPessoaHasProficionalPK(PessoaHasProficionalPK pessoaHasProficionalPK) {
        this.pessoaHasProficionalPK = pessoaHasProficionalPK;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Proficional getProficional() {
        return proficional;
    }

    public void setProficional(Proficional proficional) {
        this.proficional = proficional;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pessoaHasProficionalPK != null ? pessoaHasProficionalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaHasProficional)) {
            return false;
        }
        PessoaHasProficional other = (PessoaHasProficional) object;
        if ((this.pessoaHasProficionalPK == null && other.pessoaHasProficionalPK != null) || (this.pessoaHasProficionalPK != null && !this.pessoaHasProficionalPK.equals(other.pessoaHasProficionalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PessoaHasProficional[ pessoaHasProficionalPK=" + pessoaHasProficionalPK + " ]";
    }
    
}
