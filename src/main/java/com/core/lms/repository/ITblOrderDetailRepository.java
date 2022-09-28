package com.core.lms.repository;

import com.core.lms.entity.TblOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITblOrderDetailRepository extends JpaRepository<TblOrderDetail, Integer> {
}