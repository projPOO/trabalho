/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "pma__designer_settings")
@NamedQueries({
    @NamedQuery(name = "PmaDesignerSettings.findAll", query = "SELECT p FROM PmaDesignerSettings p")})
public class PmaDesignerSettings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "settings_data")
    private String settingsData;

    public PmaDesignerSettings() {
    }

    public PmaDesignerSettings(String username) {
        this.username = username;
    }

    public PmaDesignerSettings(String username, String settingsData) {
        this.username = username;
        this.settingsData = settingsData;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSettingsData() {
        return settingsData;
    }

    public void setSettingsData(String settingsData) {
        this.settingsData = settingsData;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaDesignerSettings)) {
            return false;
        }
        PmaDesignerSettings other = (PmaDesignerSettings) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaDesignerSettings[ username=" + username + " ]";
    }
    
}
