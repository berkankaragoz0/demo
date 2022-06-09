package com.example.demoproject1.mapper;

import com.example.demoproject1.entity.ContentEntity;
import com.example.demoproject1.entity.LicenseEntity;
import com.example.demoproject1.pojo.ContentPojo;
import com.example.demoproject1.pojo.LicensePojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContentMapper {
    public static List<ContentPojo> entityToPojo(List<ContentEntity> entityList) {
        List<ContentPojo> mappedList = new ArrayList();
        if (entityList != null) {
            Iterator var = entityList.iterator();

            while(var.hasNext()) {
                ContentEntity entity = (ContentEntity)var.next();
                ContentPojo pojo = entityToPojo(entity);
                mappedList.add(pojo);
            }
        }
        return mappedList;
    }
    public static ContentPojo entityToPojo(ContentEntity entity) {
        ContentPojo pojo = null;
        if (entity != null) {
            pojo = new ContentPojo();
            pojo.setId(entity.getId());
            pojo.setName(entity.getName());
        }
        return pojo;
    }
    public static List<ContentEntity> pojoToEntity(List<ContentPojo> pojoList){

        List<ContentEntity> mappedList = new ArrayList<ContentEntity>();
        ContentEntity entity;
        if(pojoList != null){
            for (ContentPojo pojo : pojoList){
                entity = pojoToEntity(pojo);
                mappedList.add(entity);
            }
        }

        return mappedList;
    }
    public static ContentEntity pojoToEntity(ContentPojo pojo){
        ContentEntity entity = null;

        if (pojo != null){
            entity = new ContentEntity();
            entity.setId(pojo.getId());
            entity.setName(pojo.getName());
        }
        return entity;
    }
}
