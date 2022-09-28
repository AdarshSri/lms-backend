package com.core.lms.repository;

import com.core.lms.entity.TblUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITblUserRepository extends JpaRepository<TblUser, Integer> {
}