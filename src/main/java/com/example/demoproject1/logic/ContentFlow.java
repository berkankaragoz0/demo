package com.example.demoproject1.logic;

import com.example.demoproject1.entity.ContentEntity;
import com.example.demoproject1.mapper.ContentMapper;
import com.example.demoproject1.pojo.ContentPojo;
import com.example.demoproject1.repository.ContentRepository;
import com.example.demoproject1.response.GlobalFunctions;
import com.example.demoproject1.response.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentFlow {
    @Autowired
    ContentRepository contentRepository;

    public ResponseObj createFlow(ContentPojo contentPojo) {
        ResponseObj response = null;

        ContentEntity contentEntity = ContentMapper.pojoToEntity(contentPojo);
        contentEntity = contentRepository.save(contentEntity);
        response = GlobalFunctions.createSuccesResponseWithData(contentEntity.getId());

        return response;
    }
}
