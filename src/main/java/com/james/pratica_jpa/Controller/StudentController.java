package com.james.pratica_jpa.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.pratica_jpa.Entity.Student;
import com.james.pratica_jpa.Entity.Dto.StudentDto;
import com.james.pratica_jpa.Service.StudentService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {

  private final StudentService service;

  @PostMapping
  public Student createStudent(@Valid @RequestBody StudentDto dto) {

    return service.create(dto);
  }

  @GetMapping
  public List<Student> listStudent() {

    return service.getAll();
  }

  @GetMapping("/{id}")
  public Student listStudentPutId(@PathVariable Long id) {
    return service.get(id);
  }

  @PutMapping("/{id}")
  public Student updateStudentPutId(@PathVariable Long id, @Valid @RequestBody StudentDto dtoUpdate) {
    return service.update(id, dtoUpdate);
  }

  @DeleteMapping("/{id}")
  public void deleteStudentPutId(@PathVariable Long id) {
    service.delete(id);

  }
}
