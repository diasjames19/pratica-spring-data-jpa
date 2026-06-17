package com.james.pratica_jpa.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.james.pratica_jpa.Entity.PhysicalAssessment;
import com.james.pratica_jpa.Entity.Student;
import com.james.pratica_jpa.Entity.Dto.StudentDto;
import com.james.pratica_jpa.Service.Interface.IStudentService;

@Service
public class StudentService implements IStudentService{

    @Override
    public Student create(StudentDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Student get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<Student> getAll(String dataDeNascimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
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
