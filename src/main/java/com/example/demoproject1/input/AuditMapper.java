package org.atlas.global.audit;

public class AuditMapper {

    public static AuditEn pojoToEntity(AuditEn entity, AuditP pojo){
        entity.setCreationDate(pojo.getCreationDate());
        entity.setCreatedById(pojo.getCreatedById());
        entity.setCreatedByName(pojo.getCreatedByName());
        entity.setLastUpdateDate(pojo.getLastUpdateDate());
        entity.setLastUpdateById(pojo.getLastUpdateById());
        entity.setLastUpdateByName(pojo.getLastUpdateByName());

        return entity;
    }

    public static AuditP entityToPojo(AuditEn entity, AuditP pojo){
        pojo.setCreationDate(entity.getCreationDate());
        pojo.setCreatedById(entity.getCreatedById());
        pojo.setCreatedByName(entity.getCreatedByName());
        pojo.setLastUpdateDate(entity.getLastUpdateDate());
        pojo.setLastUpdateById(entity.getLastUpdateById());
        pojo.setLastUpdateByName(entity.getLastUpdateByName());

        return pojo;
    }
}
