package com.core.lms.base.repository;

import com.core.lms.base.entity.TblOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITblOrderDetailRepository extends JpaRepository<TblOrderDetail, Integer> {
}