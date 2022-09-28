package com.core.lms.repository;

import com.core.lms.entity.MstTypeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMstTypeDetailRepository extends JpaRepository<MstTypeDetail, Integer> {
}