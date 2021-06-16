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
public class PmaCentralColumnsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "db_name")
    private String dbName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "col_name")
    private String colName;

    public PmaCentralColumnsPK() {
    }

    public PmaCentralColumnsPK(String dbName, String colName) {
        this.dbName = dbName;
        this.colName = colName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dbName != null ? dbName.hashCode() : 0);
        hash += (colName != null ? colName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaCentralColumnsPK)) {
            return false;
        }
        PmaCentralColumnsPK other = (PmaCentralColumnsPK) object;
        if ((this.dbName == null && other.dbName != null) || (this.dbName != null && !this.dbName.equals(other.dbName))) {
            return false;
        }
        if ((this.colName == null && other.colName != null) || (this.colName != null && !this.colName.equals(other.colName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaCentralColumnsPK[ dbName=" + dbName + ", colName=" + colName + " ]";
    }
    
}
