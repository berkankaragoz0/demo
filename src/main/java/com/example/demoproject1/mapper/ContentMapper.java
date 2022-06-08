package com.example.demoproject1.mapper;

import com.example.demoproject1.entity.ContentEntity;
import com.example.demoproject1.pojo.ContentPojo;

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
}
