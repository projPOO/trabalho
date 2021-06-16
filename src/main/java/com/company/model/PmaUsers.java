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
@Table(name = "pma__users")
@NamedQueries({
    @NamedQuery(name = "PmaUsers.findAll", query = "SELECT p FROM PmaUsers p")})
public class PmaUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PmaUsersPK pmaUsersPK;

    public PmaUsers() {
    }

    public PmaUsers(PmaUsersPK pmaUsersPK) {
        this.pmaUsersPK = pmaUsersPK;
    }

    public PmaUsers(String username, String usergroup) {
        this.pmaUsersPK = new PmaUsersPK(username, usergroup);
    }

    public PmaUsersPK getPmaUsersPK() {
        return pmaUsersPK;
    }

    public void setPmaUsersPK(PmaUsersPK pmaUsersPK) {
        this.pmaUsersPK = pmaUsersPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmaUsersPK != null ? pmaUsersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaUsers)) {
            return false;
        }
        PmaUsers other = (PmaUsers) object;
        if ((this.pmaUsersPK == null && other.pmaUsersPK != null) || (this.pmaUsersPK != null && !this.pmaUsersPK.equals(other.pmaUsersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaUsers[ pmaUsersPK=" + pmaUsersPK + " ]";
    }
    
}
