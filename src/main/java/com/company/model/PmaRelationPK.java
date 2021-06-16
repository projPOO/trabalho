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
import javax.validation.constraints.Size;

/**
 *
 * @author Dokuv
 */
@Embeddable
public class PmaRelationPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "master_db")
    private String masterDb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "master_table")
    private String masterTable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "master_field")
    private String masterField;

    public PmaRelationPK() {
    }

    public PmaRelationPK(String masterDb, String masterTable, String masterField) {
        this.masterDb = masterDb;
        this.masterTable = masterTable;
        this.masterField = masterField;
    }

    public String getMasterDb() {
        return masterDb;
    }

    public void setMasterDb(String masterDb) {
        this.masterDb = masterDb;
    }

    public String getMasterTable() {
        return masterTable;
    }

    public void setMasterTable(String masterTable) {
        this.masterTable = masterTable;
    }

    public String getMasterField() {
        return masterField;
    }

    public void setMasterField(String masterField) {
        this.masterField = masterField;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (masterDb != null ? masterDb.hashCode() : 0);
        hash += (masterTable != null ? masterTable.hashCode() : 0);
        hash += (masterField != null ? masterField.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaRelationPK)) {
            return false;
        }
        PmaRelationPK other = (PmaRelationPK) object;
        if ((this.masterDb == null && other.masterDb != null) || (this.masterDb != null && !this.masterDb.equals(other.masterDb))) {
            return false;
        }
        if ((this.masterTable == null && other.masterTable != null) || (this.masterTable != null && !this.masterTable.equals(other.masterTable))) {
            return false;
        }
        if ((this.masterField == null && other.masterField != null) || (this.masterField != null && !this.masterField.equals(other.masterField))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaRelationPK[ masterDb=" + masterDb + ", masterTable=" + masterTable + ", masterField=" + masterField + " ]";
    }
    
}
