package com.example.demoproject1.service;

import com.example.demoproject1.entity.LicenseEntity;
import com.example.demoproject1.mapper.LicenseMapper;
import com.example.demoproject1.pojo.LicensePojo;
import com.example.demoproject1.repository.LicenseRepository;
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
@RequestMapping("/license")
@EnableAutoConfiguration
@CrossOrigin
public class LicenseService {
    @Autowired
    LicenseRepository licenseRepository;

    @GetMapping("/getall")
    public ResponseObj getAllLicenses() {
        List<LicensePojo> licensePs = null;

        List<LicenseEntity> licenseEns = licenseRepository.getAllLicenses();
        licensePs = LicenseMapper.entityToPojo(licenseEns);

        ResponseObj response = GlobalFunctions.createSuccesResponseWithData(licensePs);
        return response;
    }
}
