package com.core.lms.base.repository;

import com.core.lms.base.entity.TblUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITblUserRepository extends JpaRepository<TblUser, Integer> {
}