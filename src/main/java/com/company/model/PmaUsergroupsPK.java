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
public class PmaUsergroupsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "usergroup")
    private String usergroup;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "tab")
    private String tab;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allowed")
    private Character allowed;

    public PmaUsergroupsPK() {
    }

    public PmaUsergroupsPK(String usergroup, String tab, Character allowed) {
        this.usergroup = usergroup;
        this.tab = tab;
        this.allowed = allowed;
    }

    public String getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(String usergroup) {
        this.usergroup = usergroup;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public Character getAllowed() {
        return allowed;
    }

    public void setAllowed(Character allowed) {
        this.allowed = allowed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usergroup != null ? usergroup.hashCode() : 0);
        hash += (tab != null ? tab.hashCode() : 0);
        hash += (allowed != null ? allowed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaUsergroupsPK)) {
            return false;
        }
        PmaUsergroupsPK other = (PmaUsergroupsPK) object;
        if ((this.usergroup == null && other.usergroup != null) || (this.usergroup != null && !this.usergroup.equals(other.usergroup))) {
            return false;
        }
        if ((this.tab == null && other.tab != null) || (this.tab != null && !this.tab.equals(other.tab))) {
            return false;
        }
        if ((this.allowed == null && other.allowed != null) || (this.allowed != null && !this.allowed.equals(other.allowed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaUsergroupsPK[ usergroup=" + usergroup + ", tab=" + tab + ", allowed=" + allowed + " ]";
    }
    
}
