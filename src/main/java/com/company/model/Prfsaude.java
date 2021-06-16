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
@Table(name = "prfsaude")
@NamedQueries({
    @NamedQuery(name = "Prfsaude.findAll", query = "SELECT p FROM Prfsaude p")})
public class Prfsaude implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prfsaude")
    private Integer idPrfsaude;
    @Size(max = 100)
    @Column(name = "nome_prfsaude")
    private String nomePrfsaude;
    @Size(max = 100)
    @Column(name = "idade_prfsaude")
    private String idadePrfsaude;
    @Size(max = 100)
    @Column(name = "cpf_prfsaude")
    private String cpfPrfsaude;
    @Size(max = 100)
    @Column(name = "crm_prfsaude")
    private String crmPrfsaude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrfsaude")
    private List<Paciente> pacienteList;

    public Prfsaude() {
    }

    public Prfsaude(Integer idPrfsaude) {
        this.idPrfsaude = idPrfsaude;
    }

    public Integer getIdPrfsaude() {
        return idPrfsaude;
    }

    public void setIdPrfsaude(Integer idPrfsaude) {
        this.idPrfsaude = idPrfsaude;
    }

    public String getNomePrfsaude() {
        return nomePrfsaude;
    }

    public void setNomePrfsaude(String nomePrfsaude) {
        this.nomePrfsaude = nomePrfsaude;
    }

    public String getIdadePrfsaude() {
        return idadePrfsaude;
    }

    public void setIdadePrfsaude(String idadePrfsaude) {
        this.idadePrfsaude = idadePrfsaude;
    }

    public String getCpfPrfsaude() {
        return cpfPrfsaude;
    }

    public void setCpfPrfsaude(String cpfPrfsaude) {
        this.cpfPrfsaude = cpfPrfsaude;
    }

    public String getCrmPrfsaude() {
        return crmPrfsaude;
    }

    public void setCrmPrfsaude(String crmPrfsaude) {
        this.crmPrfsaude = crmPrfsaude;
    }

    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrfsaude != null ? idPrfsaude.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prfsaude)) {
            return false;
        }
        Prfsaude other = (Prfsaude) object;
        if ((this.idPrfsaude == null && other.idPrfsaude != null) || (this.idPrfsaude != null && !this.idPrfsaude.equals(other.idPrfsaude))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.Prfsaude[ idPrfsaude=" + idPrfsaude + " ]";
    }
    
}
