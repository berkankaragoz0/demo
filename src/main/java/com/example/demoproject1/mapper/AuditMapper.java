package com.example.demoproject1.mapper;

import com.example.demoproject1.entity.AuditEntity;
import com.example.demoproject1.pojo.AuditPojo;

public class AuditMapper {

    public static AuditEntity pojoToEntity(AuditEntity entity, AuditPojo pojo){
        entity.setCreatedById(pojo.getCreatedById());
        entity.setCreatedByName(pojo.getCreatedByName());

        return entity;
    }

    public static AuditPojo entityToPojo(AuditEntity entity, AuditPojo pojo){
        pojo.setCreatedById(entity.getCreatedById());
        pojo.setCreatedByName(entity.getCreatedByName());

        return pojo;
    }
}
