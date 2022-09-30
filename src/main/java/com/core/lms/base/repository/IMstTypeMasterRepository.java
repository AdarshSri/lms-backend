package com.core.lms.base.repository;

import com.core.lms.base.entity.MstTypeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMstTypeMasterRepository extends JpaRepository<MstTypeMaster, Integer> {
    MstTypeMaster findByTypeMasterCode(String typeMasterCode);
}