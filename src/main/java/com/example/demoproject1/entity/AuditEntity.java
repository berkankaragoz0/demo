package org.atlas.global.audit;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
public class AuditEn {

    @Column(name = "creationdate")
    private Timestamp creationDate;

    @Column(name = "createdby")
    private Integer createdById;

    @Column(name = "createdbyname")
    private String createdByName;

    @Column(name = "lastupdatedate")
    private Timestamp lastUpdateDate;

    @Column(name = "lastupdateby")
    private Integer lastUpdateById;

    @Column(name = "lastupdatebyname")
    private String lastUpdateByName;

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getLastUpdateById() {
        return lastUpdateById;
    }

    public void setLastUpdateById(Integer lastUpdateById) {
        this.lastUpdateById = lastUpdateById;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getLastUpdateByName() {
        return lastUpdateByName;
    }

    public void setLastUpdateByName(String lastUpdateByName) {
        this.lastUpdateByName = lastUpdateByName;
    }

}