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
import javax.persistence.Lob;
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
@Table(name = "pma__central_columns")
@NamedQueries({
    @NamedQuery(name = "PmaCentralColumns.findAll", query = "SELECT p FROM PmaCentralColumns p")})
public class PmaCentralColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PmaCentralColumnsPK pmaCentralColumnsPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "col_type")
    private String colType;
    @Lob
    @Size(max = 65535)
    @Column(name = "col_length")
    private String colLength;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "col_collation")
    private String colCollation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "col_isNull")
    private boolean colisNull;
    @Size(max = 255)
    @Column(name = "col_extra")
    private String colExtra;
    @Lob
    @Size(max = 65535)
    @Column(name = "col_default")
    private String colDefault;

    public PmaCentralColumns() {
    }

    public PmaCentralColumns(PmaCentralColumnsPK pmaCentralColumnsPK) {
        this.pmaCentralColumnsPK = pmaCentralColumnsPK;
    }

    public PmaCentralColumns(PmaCentralColumnsPK pmaCentralColumnsPK, String colType, String colCollation, boolean colisNull) {
        this.pmaCentralColumnsPK = pmaCentralColumnsPK;
        this.colType = colType;
        this.colCollation = colCollation;
        this.colisNull = colisNull;
    }

    public PmaCentralColumns(String dbName, String colName) {
        this.pmaCentralColumnsPK = new PmaCentralColumnsPK(dbName, colName);
    }

    public PmaCentralColumnsPK getPmaCentralColumnsPK() {
        return pmaCentralColumnsPK;
    }

    public void setPmaCentralColumnsPK(PmaCentralColumnsPK pmaCentralColumnsPK) {
        this.pmaCentralColumnsPK = pmaCentralColumnsPK;
    }

    public String getColType() {
        return colType;
    }

    public void setColType(String colType) {
        this.colType = colType;
    }

    public String getColLength() {
        return colLength;
    }

    public void setColLength(String colLength) {
        this.colLength = colLength;
    }

    public String getColCollation() {
        return colCollation;
    }

    public void setColCollation(String colCollation) {
        this.colCollation = colCollation;
    }

    public boolean getColisNull() {
        return colisNull;
    }

    public void setColisNull(boolean colisNull) {
        this.colisNull = colisNull;
    }

    public String getColExtra() {
        return colExtra;
    }

    public void setColExtra(String colExtra) {
        this.colExtra = colExtra;
    }

    public String getColDefault() {
        return colDefault;
    }

    public void setColDefault(String colDefault) {
        this.colDefault = colDefault;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmaCentralColumnsPK != null ? pmaCentralColumnsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaCentralColumns)) {
            return false;
        }
        PmaCentralColumns other = (PmaCentralColumns) object;
        if ((this.pmaCentralColumnsPK == null && other.pmaCentralColumnsPK != null) || (this.pmaCentralColumnsPK != null && !this.pmaCentralColumnsPK.equals(other.pmaCentralColumnsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaCentralColumns[ pmaCentralColumnsPK=" + pmaCentralColumnsPK + " ]";
    }
    
}
