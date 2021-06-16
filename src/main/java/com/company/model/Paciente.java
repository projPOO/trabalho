/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "paciente")
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paciente")
    private Integer idPaciente;
    @Size(max = 100)
    @Column(name = "nome_paciente")
    private String nomePaciente;
    @Size(max = 100)
    @Column(name = "idade_paciente")
    private String idadePaciente;
    @Size(max = 100)
    @Column(name = "cpf_paciente")
    private String cpfPaciente;
    @Size(max = 100)
    @Column(name = "ddd_paciente")
    private String dddPaciente;
    @Size(max = 100)
    @Column(name = "numero_paciente")
    private String numeroPaciente;
    @Size(max = 100)
    @Column(name = "estado_paciente")
    private String estadoPaciente;
    @Size(max = 100)
    @Column(name = "cidade_paciente")
    private String cidadePaciente;
    @Size(max = 100)
    @Column(name = "rua_paciente")
    private String ruaPaciente;
    @Size(max = 100)
    @Column(name = "cep_paciente")
    private String cepPaciente;
    @Column(name = "vcn0_paciente")
    private Integer vcn0Paciente;
    @Column(name = "vcn1_paciente")
    private Integer vcn1Paciente;
    @Column(name = "vcn2_paciente")
    private Integer vcn2Paciente;
    @JoinColumn(name = "id_prfsaude", referencedColumnName = "id_prfsaude")
    @ManyToOne(optional = false)
    private Prfsaude idPrfsaude;

    public Paciente() {
    }

    public Paciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getIdadePaciente() {
        return idadePaciente;
    }

    public void setIdadePaciente(String idadePaciente) {
        this.idadePaciente = idadePaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getDddPaciente() {
        return dddPaciente;
    }

    public void setDddPaciente(String dddPaciente) {
        this.dddPaciente = dddPaciente;
    }

    public String getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(String numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public String getCidadePaciente() {
        return cidadePaciente;
    }

    public void setCidadePaciente(String cidadePaciente) {
        this.cidadePaciente = cidadePaciente;
    }

    public String getRuaPaciente() {
        return ruaPaciente;
    }

    public void setRuaPaciente(String ruaPaciente) {
        this.ruaPaciente = ruaPaciente;
    }

    public String getCepPaciente() {
        return cepPaciente;
    }

    public void setCepPaciente(String cepPaciente) {
        this.cepPaciente = cepPaciente;
    }

    public Integer getVcn0Paciente() {
        return vcn0Paciente;
    }

    public void setVcn0Paciente(Integer vcn0Paciente) {
        this.vcn0Paciente = vcn0Paciente;
    }

    public Integer getVcn1Paciente() {
        return vcn1Paciente;
    }

    public void setVcn1Paciente(Integer vcn1Paciente) {
        this.vcn1Paciente = vcn1Paciente;
    }

    public Integer getVcn2Paciente() {
        return vcn2Paciente;
    }

    public void setVcn2Paciente(Integer vcn2Paciente) {
        this.vcn2Paciente = vcn2Paciente;
    }

    public Prfsaude getIdPrfsaude() {
        return idPrfsaude;
    }

    public void setIdPrfsaude(Prfsaude idPrfsaude) {
        this.idPrfsaude = idPrfsaude;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaciente != null ? idPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.Paciente[ idPaciente=" + idPaciente + " ]";
    }
    
}
