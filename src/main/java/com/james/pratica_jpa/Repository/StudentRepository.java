package com.james.pratica_jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.james.pratica_jpa.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
