/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Dokuv
 */
@Embeddable
public class PessoaHasProficionalPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pessoa_idpe")
    private int pessoaIdpe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "proficional_idpro")
    private int proficionalIdpro;

    public PessoaHasProficionalPK() {
    }

    public PessoaHasProficionalPK(int id, int pessoaIdpe, int proficionalIdpro) {
        this.id = id;
        this.pessoaIdpe = pessoaIdpe;
        this.proficionalIdpro = proficionalIdpro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPessoaIdpe() {
        return pessoaIdpe;
    }

    public void setPessoaIdpe(int pessoaIdpe) {
        this.pessoaIdpe = pessoaIdpe;
    }

    public int getProficionalIdpro() {
        return proficionalIdpro;
    }

    public void setProficionalIdpro(int proficionalIdpro) {
        this.proficionalIdpro = proficionalIdpro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) pessoaIdpe;
        hash += (int) proficionalIdpro;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaHasProficionalPK)) {
            return false;
        }
        PessoaHasProficionalPK other = (PessoaHasProficionalPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.pessoaIdpe != other.pessoaIdpe) {
            return false;
        }
        if (this.proficionalIdpro != other.proficionalIdpro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PessoaHasProficionalPK[ id=" + id + ", pessoaIdpe=" + pessoaIdpe + ", proficionalIdpro=" + proficionalIdpro + " ]";
    }
    
}
