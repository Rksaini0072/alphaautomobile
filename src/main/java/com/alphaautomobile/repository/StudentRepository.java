package com.alphaautomobile.repository;

import com.alphaautomobile.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepository extends JpaRepository<Student, Integer>{

    @Query("select student from Student student")
    public List<Student> findStudents();
}
