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
public class PmaNavigationhidingPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "item_name")
    private String itemName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "item_type")
    private String itemType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "db_name")
    private String dbName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "table_name")
    private String tableName;

    public PmaNavigationhidingPK() {
    }

    public PmaNavigationhidingPK(String username, String itemName, String itemType, String dbName, String tableName) {
        this.username = username;
        this.itemName = itemName;
        this.itemType = itemType;
        this.dbName = dbName;
        this.tableName = tableName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        hash += (itemName != null ? itemName.hashCode() : 0);
        hash += (itemType != null ? itemType.hashCode() : 0);
        hash += (dbName != null ? dbName.hashCode() : 0);
        hash += (tableName != null ? tableName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaNavigationhidingPK)) {
            return false;
        }
        PmaNavigationhidingPK other = (PmaNavigationhidingPK) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        if ((this.itemName == null && other.itemName != null) || (this.itemName != null && !this.itemName.equals(other.itemName))) {
            return false;
        }
        if ((this.itemType == null && other.itemType != null) || (this.itemType != null && !this.itemType.equals(other.itemType))) {
            return false;
        }
        if ((this.dbName == null && other.dbName != null) || (this.dbName != null && !this.dbName.equals(other.dbName))) {
            return false;
        }
        if ((this.tableName == null && other.tableName != null) || (this.tableName != null && !this.tableName.equals(other.tableName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaNavigationhidingPK[ username=" + username + ", itemName=" + itemName + ", itemType=" + itemType + ", dbName=" + dbName + ", tableName=" + tableName + " ]";
    }
    
}
