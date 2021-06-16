/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Dokuv
 */
@Entity
@Table(name = "pma__navigationhiding")
@NamedQueries({
    @NamedQuery(name = "PmaNavigationhiding.findAll", query = "SELECT p FROM PmaNavigationhiding p")})
public class PmaNavigationhiding implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PmaNavigationhidingPK pmaNavigationhidingPK;

    public PmaNavigationhiding() {
    }

    public PmaNavigationhiding(PmaNavigationhidingPK pmaNavigationhidingPK) {
        this.pmaNavigationhidingPK = pmaNavigationhidingPK;
    }

    public PmaNavigationhiding(String username, String itemName, String itemType, String dbName, String tableName) {
        this.pmaNavigationhidingPK = new PmaNavigationhidingPK(username, itemName, itemType, dbName, tableName);
    }

    public PmaNavigationhidingPK getPmaNavigationhidingPK() {
        return pmaNavigationhidingPK;
    }

    public void setPmaNavigationhidingPK(PmaNavigationhidingPK pmaNavigationhidingPK) {
        this.pmaNavigationhidingPK = pmaNavigationhidingPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmaNavigationhidingPK != null ? pmaNavigationhidingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaNavigationhiding)) {
            return false;
        }
        PmaNavigationhiding other = (PmaNavigationhiding) object;
        if ((this.pmaNavigationhidingPK == null && other.pmaNavigationhidingPK != null) || (this.pmaNavigationhidingPK != null && !this.pmaNavigationhidingPK.equals(other.pmaNavigationhidingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaNavigationhiding[ pmaNavigationhidingPK=" + pmaNavigationhidingPK + " ]";
    }
    
}
