package com.james.pratica_jpa.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.pratica_jpa.Entity.Student;
import com.james.pratica_jpa.Entity.Dto.StudentDto;
import com.james.pratica_jpa.Service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {

private StudentService service;

@PostMapping
public Student createStudent(@Valid @RequestBody StudentDto dto) {
      
        return service.create(dto);
    }
@GetMapping("/list")
public List<Student> listStudent(StudentDto dto){
    
    return service.getAll(dto);
}
    
}
