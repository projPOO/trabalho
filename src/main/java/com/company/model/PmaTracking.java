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
@Table(name = "pma__tracking")
@NamedQueries({
    @NamedQuery(name = "PmaTracking.findAll", query = "SELECT p FROM PmaTracking p")})
public class PmaTracking implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PmaTrackingPK pmaTrackingPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "schema_snapshot")
    private String schemaSnapshot;
    @Lob
    @Size(max = 65535)
    @Column(name = "schema_sql")
    private String schemaSql;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "data_sql")
    private String dataSql;
    @Size(max = 188)
    @Column(name = "tracking")
    private String tracking;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tracking_active")
    private int trackingActive;

    public PmaTracking() {
    }

    public PmaTracking(PmaTrackingPK pmaTrackingPK) {
        this.pmaTrackingPK = pmaTrackingPK;
    }

    public PmaTracking(PmaTrackingPK pmaTrackingPK, Date dateCreated, Date dateUpdated, String schemaSnapshot, int trackingActive) {
        this.pmaTrackingPK = pmaTrackingPK;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.schemaSnapshot = schemaSnapshot;
        this.trackingActive = trackingActive;
    }

    public PmaTracking(String dbName, String tableName, int version) {
        this.pmaTrackingPK = new PmaTrackingPK(dbName, tableName, version);
    }

    public PmaTrackingPK getPmaTrackingPK() {
        return pmaTrackingPK;
    }

    public void setPmaTrackingPK(PmaTrackingPK pmaTrackingPK) {
        this.pmaTrackingPK = pmaTrackingPK;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getSchemaSnapshot() {
        return schemaSnapshot;
    }

    public void setSchemaSnapshot(String schemaSnapshot) {
        this.schemaSnapshot = schemaSnapshot;
    }

    public String getSchemaSql() {
        return schemaSql;
    }

    public void setSchemaSql(String schemaSql) {
        this.schemaSql = schemaSql;
    }

    public String getDataSql() {
        return dataSql;
    }

    public void setDataSql(String dataSql) {
        this.dataSql = dataSql;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public int getTrackingActive() {
        return trackingActive;
    }

    public void setTrackingActive(int trackingActive) {
        this.trackingActive = trackingActive;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmaTrackingPK != null ? pmaTrackingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaTracking)) {
            return false;
        }
        PmaTracking other = (PmaTracking) object;
        if ((this.pmaTrackingPK == null && other.pmaTrackingPK != null) || (this.pmaTrackingPK != null && !this.pmaTrackingPK.equals(other.pmaTrackingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaTracking[ pmaTrackingPK=" + pmaTrackingPK + " ]";
    }
    
}
