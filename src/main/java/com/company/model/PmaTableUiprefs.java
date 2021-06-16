/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Dokuv
 */
@Entity
@Table(name = "pma__table_uiprefs")
@NamedQueries({
    @NamedQuery(name = "PmaTableUiprefs.findAll", query = "SELECT p FROM PmaTableUiprefs p")})
public class PmaTableUiprefs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PmaTableUiprefsPK pmaTableUiprefsPK;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "prefs")
    private String prefs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    public PmaTableUiprefs() {
    }

    public PmaTableUiprefs(PmaTableUiprefsPK pmaTableUiprefsPK) {
        this.pmaTableUiprefsPK = pmaTableUiprefsPK;
    }

    public PmaTableUiprefs(PmaTableUiprefsPK pmaTableUiprefsPK, String prefs, Date lastUpdate) {
        this.pmaTableUiprefsPK = pmaTableUiprefsPK;
        this.prefs = prefs;
        this.lastUpdate = lastUpdate;
    }

    public PmaTableUiprefs(String username, String dbName, String tableName) {
        this.pmaTableUiprefsPK = new PmaTableUiprefsPK(username, dbName, tableName);
    }

    public PmaTableUiprefsPK getPmaTableUiprefsPK() {
        return pmaTableUiprefsPK;
    }

    public void setPmaTableUiprefsPK(PmaTableUiprefsPK pmaTableUiprefsPK) {
        this.pmaTableUiprefsPK = pmaTableUiprefsPK;
    }

    public String getPrefs() {
        return prefs;
    }

    public void setPrefs(String prefs) {
        this.prefs = prefs;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmaTableUiprefsPK != null ? pmaTableUiprefsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaTableUiprefs)) {
            return false;
        }
        PmaTableUiprefs other = (PmaTableUiprefs) object;
        if ((this.pmaTableUiprefsPK == null && other.pmaTableUiprefsPK != null) || (this.pmaTableUiprefsPK != null && !this.pmaTableUiprefsPK.equals(other.pmaTableUiprefsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaTableUiprefs[ pmaTableUiprefsPK=" + pmaTableUiprefsPK + " ]";
    }
    
}
