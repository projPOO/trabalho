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
public class EndPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idend")
    private int idend;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pessoa_idpe")
    private int pessoaIdpe;

    public EndPK() {
    }

    public EndPK(int idend, int pessoaIdpe) {
        this.idend = idend;
        this.pessoaIdpe = pessoaIdpe;
    }

    public int getIdend() {
        return idend;
    }

    public void setIdend(int idend) {
        this.idend = idend;
    }

    public int getPessoaIdpe() {
        return pessoaIdpe;
    }

    public void setPessoaIdpe(int pessoaIdpe) {
        this.pessoaIdpe = pessoaIdpe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idend;
        hash += (int) pessoaIdpe;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EndPK)) {
            return false;
        }
        EndPK other = (EndPK) object;
        if (this.idend != other.idend) {
            return false;
        }
        if (this.pessoaIdpe != other.pessoaIdpe) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.EndPK[ idend=" + idend + ", pessoaIdpe=" + pessoaIdpe + " ]";
    }
    
}
