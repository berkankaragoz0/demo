package com.example.demoproject1.pojo;

import java.sql.Timestamp;

public class AuditPojo {
    private Integer createdById;
    private String createdByName;

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

}
