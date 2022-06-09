package com.example.demoproject1.service;

import com.example.demoproject1.entity.ContentEntity;
import com.example.demoproject1.logic.ContentFlow;
import com.example.demoproject1.mapper.ContentMapper;
import com.example.demoproject1.pojo.ContentPojo;
import com.example.demoproject1.pojo.LicensePojo;
import com.example.demoproject1.repository.ContentRepository;
import com.example.demoproject1.response.GlobalFunctions;
import com.example.demoproject1.response.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content")
@EnableAutoConfiguration
@CrossOrigin
public class ContentService {
    @Autowired
    ContentRepository contentRepository;
    @Autowired
    ContentFlow flow;

    @GetMapping("/getall")
    public ResponseObj getAllContents() {
        List<ContentPojo> contentPs = null;

        List<ContentEntity> contentEns = contentRepository.getAllContents();
        contentPs = ContentMapper.entityToPojo(contentEns);

        ResponseObj response = GlobalFunctions.createSuccesResponseWithData(contentPs);
        return response;
    }

    @PostMapping("/create")
    public ResponseObj createContent(@RequestBody ContentPojo contentPojo) {
        ResponseObj response = null;

        response = flow.createFlow(contentPojo);

        return response;
    }
}
