package com.example.demoproject1.mapper;

import com.example.demoproject1.entity.ContentEntity;
import com.example.demoproject1.entity.LicenseEntity;
import com.example.demoproject1.pojo.ContentPojo;
import com.example.demoproject1.pojo.LicensePojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LicenseMapper {
    public static List<LicensePojo> entityToPojo(List<LicenseEntity> entityList) {
        List<LicensePojo> mappedList = new ArrayList();
        if (entityList != null) {
            Iterator var = entityList.iterator();

            while(var.hasNext()) {
                LicenseEntity entity = (LicenseEntity)var.next();
                LicensePojo pojo = entityToPojo(entity);
                mappedList.add(pojo);
            }
        }
        return mappedList;
    }
    public static LicensePojo entityToPojo(LicenseEntity entity) {
        LicensePojo pojo = null;
        if (entity != null) {
            pojo = new LicensePojo();
            pojo.setId(entity.getId());
            pojo.setName(entity.getName());
        }
        return pojo;
    }
}
