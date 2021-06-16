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
@Table(name = "pma__column_info")
@NamedQueries({
    @NamedQuery(name = "PmaColumnInfo.findAll", query = "SELECT p FROM PmaColumnInfo p")})
public class PmaColumnInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "column_name")
    private String columnName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "mimetype")
    private String mimetype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "transformation")
    private String transformation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "transformation_options")
    private String transformationOptions;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "input_transformation")
    private String inputTransformation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "input_transformation_options")
    private String inputTransformationOptions;

    public PmaColumnInfo() {
    }

    public PmaColumnInfo(Integer id) {
        this.id = id;
    }

    public PmaColumnInfo(Integer id, String dbName, String tableName, String columnName, String comment, String mimetype, String transformation, String transformationOptions, String inputTransformation, String inputTransformationOptions) {
        this.id = id;
        this.dbName = dbName;
        this.tableName = tableName;
        this.columnName = columnName;
        this.comment = comment;
        this.mimetype = mimetype;
        this.transformation = transformation;
        this.transformationOptions = transformationOptions;
        this.inputTransformation = inputTransformation;
        this.inputTransformationOptions = inputTransformationOptions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getTransformation() {
        return transformation;
    }

    public void setTransformation(String transformation) {
        this.transformation = transformation;
    }

    public String getTransformationOptions() {
        return transformationOptions;
    }

    public void setTransformationOptions(String transformationOptions) {
        this.transformationOptions = transformationOptions;
    }

    public String getInputTransformation() {
        return inputTransformation;
    }

    public void setInputTransformation(String inputTransformation) {
        this.inputTransformation = inputTransformation;
    }

    public String getInputTransformationOptions() {
        return inputTransformationOptions;
    }

    public void setInputTransformationOptions(String inputTransformationOptions) {
        this.inputTransformationOptions = inputTransformationOptions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PmaColumnInfo)) {
            return false;
        }
        PmaColumnInfo other = (PmaColumnInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entityclasse.PmaColumnInfo[ id=" + id + " ]";
    }
    
}
