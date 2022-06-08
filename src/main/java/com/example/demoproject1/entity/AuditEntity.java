package com.example.demoproject1.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
public class AuditEntity {

    @Column(name = "createdby")
    private Integer createdById;

    @Column(name = "createdbyname")
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