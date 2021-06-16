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
@Table(name = "pma__usergroups")
@NamedQueries({
    @NamedQuery(name = "PmaUsergroups.findAll", query = "SELECT p FROM PmaUsergroups p")})
public class PmaUsergroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PmaUsergroupsPK pmaUsergroupsPK;

    public PmaUsergroups() {
    }

    public PmaUsergroups(PmaUsergroupsPK pmaUsergroupsPK) {
        this.pmaUsergroupsPK = pmaUsergroupsPK;
    }

    public PmaUsergroups(String usergroup, String tab, Character allowed) {
        this.pmaUsergroupsPK = new PmaUsergroupsPK(usergroup, tab, allowed);
    }

    public PmaUsergroupsPK getPmaUsergroupsPK() {
        return pmaUsergroupsPK;
    }

    public void setPmaUsergroupsPK(PmaUsergroupsPK pmaUsergroupsPK) {
        this.pmaUsergroupsPK = pmaUsergroupsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmaUsergroupsPK != null ? pmaUsergroupsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaUsergroups)) {
            return false;
        }
        PmaUsergroups other = (PmaUsergroups) object;
        if ((this.pmaUsergroupsPK == null && other.pmaUsergroupsPK != null) || (this.pmaUsergroupsPK != null && !this.pmaUsergroupsPK.equals(other.pmaUsergroupsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaUsergroups[ pmaUsergroupsPK=" + pmaUsergroupsPK + " ]";
    }
    
}
