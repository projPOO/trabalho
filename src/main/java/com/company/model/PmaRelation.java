/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Dokuv
 */
@Entity
@Table(name = "pma__relation")
@NamedQueries({
    @NamedQuery(name = "PmaRelation.findAll", query = "SELECT p FROM PmaRelation p")})
public class PmaRelation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PmaRelationPK pmaRelationPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "foreign_db")
    private String foreignDb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "foreign_table")
    private String foreignTable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "foreign_field")
    private String foreignField;

    public PmaRelation() {
    }

    public PmaRelation(PmaRelationPK pmaRelationPK) {
        this.pmaRelationPK = pmaRelationPK;
    }

    public PmaRelation(PmaRelationPK pmaRelationPK, String foreignDb, String foreignTable, String foreignField) {
        this.pmaRelationPK = pmaRelationPK;
        this.foreignDb = foreignDb;
        this.foreignTable = foreignTable;
        this.foreignField = foreignField;
    }

    public PmaRelation(String masterDb, String masterTable, String masterField) {
        this.pmaRelationPK = new PmaRelationPK(masterDb, masterTable, masterField);
    }

    public PmaRelationPK getPmaRelationPK() {
        return pmaRelationPK;
    }

    public void setPmaRelationPK(PmaRelationPK pmaRelationPK) {
        this.pmaRelationPK = pmaRelationPK;
    }

    public String getForeignDb() {
        return foreignDb;
    }

    public void setForeignDb(String foreignDb) {
        this.foreignDb = foreignDb;
    }

    public String getForeignTable() {
        return foreignTable;
    }

    public void setForeignTable(String foreignTable) {
        this.foreignTable = foreignTable;
    }

    public String getForeignField() {
        return foreignField;
    }

    public void setForeignField(String foreignField) {
        this.foreignField = foreignField;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmaRelationPK != null ? pmaRelationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaRelation)) {
            return false;
        }
        PmaRelation other = (PmaRelation) object;
        if ((this.pmaRelationPK == null && other.pmaRelationPK != null) || (this.pmaRelationPK != null && !this.pmaRelationPK.equals(other.pmaRelationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaRelation[ pmaRelationPK=" + pmaRelationPK + " ]";
    }
    
}
