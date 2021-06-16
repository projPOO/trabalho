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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Dokuv
 */
@Entity
@Table(name = "pessoa")
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p")})
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpe")
    private Integer idpe;
    @Size(max = 45)
    @Column(name = "nome")
    private String nome;
    @Size(max = 45)
    @Column(name = "idade")
    private String idade;
    @Size(max = 45)
    @Column(name = "cpf")
    private String cpf;
    @Size(max = 45)
    @Column(name = "ddd")
    private String ddd;
    @Size(max = 45)
    @Column(name = "numero")
    private String numero;
    @Size(max = 45)
    @Column(name = "vcn1")
    private String vcn1;
    @Size(max = 45)
    @Column(name = "vcn2")
    private String vcn2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private List<End> endList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private List<PessoaHasProficional> pessoaHasProficionalList;

    public Pessoa() {
    }

    public Pessoa(Integer idpe) {
        this.idpe = idpe;
    }

    public Integer getIdpe() {
        return idpe;
    }

    public void setIdpe(Integer idpe) {
        this.idpe = idpe;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVcn1() {
        return vcn1;
    }

    public void setVcn1(String vcn1) {
        this.vcn1 = vcn1;
    }

    public String getVcn2() {
        return vcn2;
    }

    public void setVcn2(String vcn2) {
        this.vcn2 = vcn2;
    }

    public List<End> getEndList() {
        return endList;
    }

    public void setEndList(List<End> endList) {
        this.endList = endList;
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
        hash += (idpe != null ? idpe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idpe == null && other.idpe != null) || (this.idpe != null && !this.idpe.equals(other.idpe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.Pessoa[ idpe=" + idpe + " ]";
    }
    
}
