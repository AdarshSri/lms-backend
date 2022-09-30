package com.core.lms.base.repository;

import com.core.lms.base.entity.TblEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITblEmployeeRepository extends JpaRepository<TblEmployee, Integer> {
    TblEmployee findByEmployeeCodeAndIsActive(String employeeCode, Boolean isActive);
}