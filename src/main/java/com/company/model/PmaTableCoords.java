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

/**
 *
 * @author Dokuv
 */
@Entity
@Table(name = "pma__table_coords")
@NamedQueries({
    @NamedQuery(name = "PmaTableCoords.findAll", query = "SELECT p FROM PmaTableCoords p")})
public class PmaTableCoords implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PmaTableCoordsPK pmaTableCoordsPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "x")
    private float x;
    @Basic(optional = false)
    @NotNull
    @Column(name = "y")
    private float y;

    public PmaTableCoords() {
    }

    public PmaTableCoords(PmaTableCoordsPK pmaTableCoordsPK) {
        this.pmaTableCoordsPK = pmaTableCoordsPK;
    }

    public PmaTableCoords(PmaTableCoordsPK pmaTableCoordsPK, float x, float y) {
        this.pmaTableCoordsPK = pmaTableCoordsPK;
        this.x = x;
        this.y = y;
    }

    public PmaTableCoords(String dbName, String tableName, int pdfPageNumber) {
        this.pmaTableCoordsPK = new PmaTableCoordsPK(dbName, tableName, pdfPageNumber);
    }

    public PmaTableCoordsPK getPmaTableCoordsPK() {
        return pmaTableCoordsPK;
    }

    public void setPmaTableCoordsPK(PmaTableCoordsPK pmaTableCoordsPK) {
        this.pmaTableCoordsPK = pmaTableCoordsPK;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmaTableCoordsPK != null ? pmaTableCoordsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaTableCoords)) {
            return false;
        }
        PmaTableCoords other = (PmaTableCoords) object;
        if ((this.pmaTableCoordsPK == null && other.pmaTableCoordsPK != null) || (this.pmaTableCoordsPK != null && !this.pmaTableCoordsPK.equals(other.pmaTableCoordsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaTableCoords[ pmaTableCoordsPK=" + pmaTableCoordsPK + " ]";
    }
    
}
