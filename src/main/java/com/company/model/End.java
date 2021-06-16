/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Dokuv
 */
@Entity
@Table(name = "end")
@NamedQueries({
    @NamedQuery(name = "End.findAll", query = "SELECT e FROM End e")})
public class End implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EndPK endPK;
    @Size(max = 45)
    @Column(name = "estado")
    private String estado;
    @Size(max = 45)
    @Column(name = "cidade")
    private String cidade;
    @Size(max = 45)
    @Column(name = "rua")
    private String rua;
    @Size(max = 45)
    @Column(name = "cep")
    private String cep;
    @JoinColumn(name = "pessoa_idpe", referencedColumnName = "idpe", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pessoa pessoa;

    public End() {
    }

    public End(EndPK endPK) {
        this.endPK = endPK;
    }

    public End(int idend, int pessoaIdpe) {
        this.endPK = new EndPK(idend, pessoaIdpe);
    }

    public EndPK getEndPK() {
        return endPK;
    }

    public void setEndPK(EndPK endPK) {
        this.endPK = endPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (endPK != null ? endPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof End)) {
            return false;
        }
        End other = (End) object;
        if ((this.endPK == null && other.endPK != null) || (this.endPK != null && !this.endPK.equals(other.endPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.End[ endPK=" + endPK + " ]";
    }
    
}
