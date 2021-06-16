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
public class PmaTableCoordsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "db_name")
    private String dbName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "table_name")
    private String tableName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pdf_page_number")
    private int pdfPageNumber;

    public PmaTableCoordsPK() {
    }

    public PmaTableCoordsPK(String dbName, String tableName, int pdfPageNumber) {
        this.dbName = dbName;
        this.tableName = tableName;
        this.pdfPageNumber = pdfPageNumber;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getPdfPageNumber() {
        return pdfPageNumber;
    }

    public void setPdfPageNumber(int pdfPageNumber) {
        this.pdfPageNumber = pdfPageNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dbName != null ? dbName.hashCode() : 0);
        hash += (tableName != null ? tableName.hashCode() : 0);
        hash += (int) pdfPageNumber;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaTableCoordsPK)) {
            return false;
        }
        PmaTableCoordsPK other = (PmaTableCoordsPK) object;
        if ((this.dbName == null && other.dbName != null) || (this.dbName != null && !this.dbName.equals(other.dbName))) {
            return false;
        }
        if ((this.tableName == null && other.tableName != null) || (this.tableName != null && !this.tableName.equals(other.tableName))) {
            return false;
        }
        if (this.pdfPageNumber != other.pdfPageNumber) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaTableCoordsPK[ dbName=" + dbName + ", tableName=" + tableName + ", pdfPageNumber=" + pdfPageNumber + " ]";
    }
    
}
