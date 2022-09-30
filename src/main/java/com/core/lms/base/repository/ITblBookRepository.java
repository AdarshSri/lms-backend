package com.core.lms.base.repository;

import com.core.lms.base.entity.TblBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITblBookRepository extends JpaRepository<TblBook, Integer> {
}