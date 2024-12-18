package com.tt.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tt.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
