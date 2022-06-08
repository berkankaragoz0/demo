package com.example.demoproject1.repository;

import com.example.demoproject1.entity.LicenseEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LicenseRepository  extends CrudRepository<LicenseEntity, Integer>, JpaSpecificationExecutor<LicenseEntity> {
    LicenseEntity findOneById(Integer id);

    @Query(value = "select * from license order by id desc", nativeQuery = true)
    List<LicenseEntity> getAllLicenses();
}
