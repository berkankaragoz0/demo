package org.atlas.global.audit;

import java.sql.Timestamp;

public class AuditP {
    private Timestamp creationDate;
    private Integer createdById;
    private String createdByName;
    private Timestamp lastUpdateDate;
    private Integer lastUpdateById;
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
