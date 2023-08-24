package com.example.day4.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}