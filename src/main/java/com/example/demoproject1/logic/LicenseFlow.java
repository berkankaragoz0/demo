package com.example.demoproject1.logic;

import com.example.demoproject1.entity.LicenseEntity;
import com.example.demoproject1.mapper.LicenseMapper;
import com.example.demoproject1.pojo.LicensePojo;
import com.example.demoproject1.repository.LicenseRepository;
import com.example.demoproject1.response.GlobalFunctions;
import com.example.demoproject1.response.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class LicenseFlow {
    @Autowired
    LicenseRepository licenseRepository;

    public ResponseObj createFlow(LicensePojo licenseP) {
        ResponseObj response = null;

        LicenseEntity licenseEn = LicenseMapper.pojoToEntity(licenseP);
        licenseEn = licenseRepository.save(licenseEn);
        response = GlobalFunctions.createSuccesResponseWithData(licenseEn.getId());

        return response;
    }

}
