package com.core.lms.repository;

import com.core.lms.entity.MstTypeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMstTypeMasterRepository extends JpaRepository<MstTypeMaster, Integer> {
    MstTypeMaster findByTypeMasterCode(String typeMasterCode);
}