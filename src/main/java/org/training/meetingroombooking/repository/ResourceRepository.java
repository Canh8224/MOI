package org.training.meetingroombooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.training.meetingroombooking.entity.Resource;

import java.util.List;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {

    @Query("SELECT r FROM Resource r WHERE " +
            "(:name IS NULL OR r.name LIKE %:name%) AND " +
            "(:phone IS NULL OR r.phone LIKE %:phone%) AND " +
            "(:skill IS NULL OR r.skill LIKE %:skill%)")
    List<Resource> searchResources(
            @Param("name") String name,
            @Param("phone") String phone,
            @Param("skill") String skill);
}
