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
@Table(name = "pma__table_info")
@NamedQueries({
    @NamedQuery(name = "PmaTableInfo.findAll", query = "SELECT p FROM PmaTableInfo p")})
public class PmaTableInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PmaTableInfoPK pmaTableInfoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "display_field")
    private String displayField;

    public PmaTableInfo() {
    }

    public PmaTableInfo(PmaTableInfoPK pmaTableInfoPK) {
        this.pmaTableInfoPK = pmaTableInfoPK;
    }

    public PmaTableInfo(PmaTableInfoPK pmaTableInfoPK, String displayField) {
        this.pmaTableInfoPK = pmaTableInfoPK;
        this.displayField = displayField;
    }

    public PmaTableInfo(String dbName, String tableName) {
        this.pmaTableInfoPK = new PmaTableInfoPK(dbName, tableName);
    }

    public PmaTableInfoPK getPmaTableInfoPK() {
        return pmaTableInfoPK;
    }

    public void setPmaTableInfoPK(PmaTableInfoPK pmaTableInfoPK) {
        this.pmaTableInfoPK = pmaTableInfoPK;
    }

    public String getDisplayField() {
        return displayField;
    }

    public void setDisplayField(String displayField) {
        this.displayField = displayField;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmaTableInfoPK != null ? pmaTableInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaTableInfo)) {
            return false;
        }
        PmaTableInfo other = (PmaTableInfo) object;
        if ((this.pmaTableInfoPK == null && other.pmaTableInfoPK != null) || (this.pmaTableInfoPK != null && !this.pmaTableInfoPK.equals(other.pmaTableInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaTableInfo[ pmaTableInfoPK=" + pmaTableInfoPK + " ]";
    }
    
}
