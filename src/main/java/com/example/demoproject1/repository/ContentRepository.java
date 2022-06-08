package com.example.demoproject1.repository;

import com.example.demoproject1.entity.ContentEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContentRepository extends CrudRepository<ContentEntity, Integer>, JpaSpecificationExecutor<ContentEntity> {
    ContentEntity findOneById(Integer id);

    @Query(value = "select * from content order by id desc", nativeQuery = true)
    List<ContentEntity> getAllContents();
}
