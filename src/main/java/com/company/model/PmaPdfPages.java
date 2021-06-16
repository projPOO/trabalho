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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "pma__pdf_pages")
@NamedQueries({
    @NamedQuery(name = "PmaPdfPages.findAll", query = "SELECT p FROM PmaPdfPages p")})
public class PmaPdfPages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "db_name")
    private String dbName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "page_nr")
    private Integer pageNr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "page_descr")
    private String pageDescr;

    public PmaPdfPages() {
    }

    public PmaPdfPages(Integer pageNr) {
        this.pageNr = pageNr;
    }

    public PmaPdfPages(Integer pageNr, String dbName, String pageDescr) {
        this.pageNr = pageNr;
        this.dbName = dbName;
        this.pageDescr = pageDescr;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Integer getPageNr() {
        return pageNr;
    }

    public void setPageNr(Integer pageNr) {
        this.pageNr = pageNr;
    }

    public String getPageDescr() {
        return pageDescr;
    }

    public void setPageDescr(String pageDescr) {
        this.pageDescr = pageDescr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pageNr != null ? pageNr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaPdfPages)) {
            return false;
        }
        PmaPdfPages other = (PmaPdfPages) object;
        if ((this.pageNr == null && other.pageNr != null) || (this.pageNr != null && !this.pageNr.equals(other.pageNr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaPdfPages[ pageNr=" + pageNr + " ]";
    }
    
}
