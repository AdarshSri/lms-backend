package com.core.lms.repository;

import com.core.lms.entity.TblEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITblEmployeeRepository extends JpaRepository<TblEmployee, Integer> {
}