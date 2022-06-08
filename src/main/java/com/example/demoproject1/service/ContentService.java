package com.example.demoproject1.service;

import com.example.demoproject1.entity.ContentEntity;
import com.example.demoproject1.mapper.ContentMapper;
import com.example.demoproject1.pojo.ContentPojo;
import com.example.demoproject1.repository.ContentRepository;
import com.example.demoproject1.response.GlobalFunctions;
import com.example.demoproject1.response.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/content")
@EnableAutoConfiguration
@CrossOrigin
public class ContentService {
    @Autowired
    ContentRepository contentRepository;

    @GetMapping("/getall")
    public ResponseObj getAllContents() {
        List<ContentPojo> contentPs = null;

        List<ContentEntity> contentEns = contentRepository.getAllContents();
        contentPs = ContentMapper.entityToPojo(contentEns);

        ResponseObj response = GlobalFunctions.createSuccesResponseWithData(contentPs);
        return response;
    }
}
