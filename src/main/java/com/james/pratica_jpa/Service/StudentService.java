package com.james.pratica_jpa.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.james.pratica_jpa.Entity.PhysicalAssessment;
import com.james.pratica_jpa.Entity.Student;
import com.james.pratica_jpa.Entity.Dto.StudentDto;
import com.james.pratica_jpa.Repository.StudentRepository;
import com.james.pratica_jpa.Service.Interface.IStudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

    private final StudentRepository repository;

    @Override
    public Student create(StudentDto dto) {
        try {

            Student newStudent = new Student();
            newStudent.setName(dto.getName());
            newStudent.setCpf(dto.getCpf());
            newStudent.setNeighborhood(dto.getNeighborhood());
            newStudent.setDateOfBirth(dto.getDateOfBirth());

            return repository.save(newStudent);

        } catch (Exception e) {
            System.out.println("Error in Create: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public Student get(Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found!"));
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = repository.findAll();

        System.out.println("Dados Retornados: " + students);

        return students;
    }

    @Override
    public Student update(Long id, StudentDto dtoUpdate) {

        try {
            boolean ckStudent = repository.existsById(id);

            if (!ckStudent) {
                throw new RuntimeException("Student not found!");
            }
            Student updateStudent = new Student();
            updateStudent.setName(dtoUpdate.getName());
            updateStudent.setCpf(dtoUpdate.getCpf());
            updateStudent.setNeighborhood(dtoUpdate.getNeighborhood());
            updateStudent.setDateOfBirth(dtoUpdate.getDateOfBirth());

            return repository.save(updateStudent);

        } catch (Exception e) {
            System.out.println("Error in metodo Update: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public void delete(Long id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found!"));

        repository.delete(student);
    }

    @Override
    public List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPhysicalAssessmentId'");
    }

}