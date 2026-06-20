package com.james.pratica_jpa.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.james.pratica_jpa.Entity.PhysicalAssessment;
import com.james.pratica_jpa.Entity.Student;
import com.james.pratica_jpa.Entity.Dto.StudentDto;
import com.james.pratica_jpa.Repository.StudentRepository;
import com.james.pratica_jpa.Service.Interface.IStudentService;

@Service
public class StudentService implements IStudentService{

    private StudentRepository repository;

    @Override
    public Student create(StudentDto dto) {
        Student newStudent = new Student();
        newStudent.setName(dto.getName());
        newStudent.setCpf(dto.getCpf());
        newStudent.setNeighborhood(dto.getNeighborhood());
        newStudent.setDateOfBirth(dto.getDateOfBirth());

        return repository.save(newStudent);
        
    }

    @Override
    public Student get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<Student> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public Student update(Long id, StudentDto dtoUpdate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPhysicalAssessmentId'");
    }
    
}
