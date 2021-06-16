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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "pma__userconfig")
@NamedQueries({
    @NamedQuery(name = "PmaUserconfig.findAll", query = "SELECT p FROM PmaUserconfig p")})
public class PmaUserconfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Column(name = "timevalue")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timevalue;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "config_data")
    private String configData;

    public PmaUserconfig() {
    }

    public PmaUserconfig(String username) {
        this.username = username;
    }

    public PmaUserconfig(String username, Date timevalue, String configData) {
        this.username = username;
        this.timevalue = timevalue;
        this.configData = configData;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTimevalue() {
        return timevalue;
    }

    public void setTimevalue(Date timevalue) {
        this.timevalue = timevalue;
    }

    public String getConfigData() {
        return configData;
    }

    public void setConfigData(String configData) {
        this.configData = configData;
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
        if (!(object instanceof PmaUserconfig)) {
            return false;
        }
        PmaUserconfig other = (PmaUserconfig) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaUserconfig[ username=" + username + " ]";
    }
    
}
