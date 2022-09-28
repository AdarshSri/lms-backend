package com.core.lms.repository;

import com.core.lms.entity.TblOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITblOrderRepository extends JpaRepository<TblOrder, Integer> {
}