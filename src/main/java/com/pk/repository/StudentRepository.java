package com.pk.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pk.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
