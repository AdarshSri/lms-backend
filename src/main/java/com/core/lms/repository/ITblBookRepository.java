package com.core.lms.repository;

import com.core.lms.entity.TblBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITblBookRepository extends JpaRepository<TblBook, Integer> {
}