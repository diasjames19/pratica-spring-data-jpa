package com.james.pratica_jpa.Service.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.james.pratica_jpa.Entity.PhysicalAssessment;
import com.james.pratica_jpa.Entity.Student;
import com.james.pratica_jpa.Entity.Dto.StudentDto;

@Service
public interface IStudentService {

    Student create(StudentDto dto);

  /**
   * Retorna um Aluno que está no banco de dados de acordo com seu Id.
   * @param id id do Aluno que será exibido.
   * @return Aluno de acordo com o Id fornecido.
   */
  Student get(Long id);

  /**
   * Retorna os Alunos que estão no banco de dados.
   * @return Uma lista os Alunos que estão salvas no DB.
   */
  List<Student> getAll();

  /**
   * Atualiza o Aluno.
   * @param id id do Aluno que será atualizado.
   * @param dtoUpdate formulário referente aos dados necessários para atualização do Aluno
   * no banco de dados.
   * @return Aluno recém-atualizado.
   */
  Student update(Long id, StudentDto dtoUpdate);

  /**
   * Deleta um Aluno específico.
   * @param id id do Aluno que será removido.
   */
  void delete(Long id);

  /**
   *
   * @param id id do aluno que será recuperada a lista de avaliações
   * @return uma lista com todas as avaliações do aluno de acordo com o Id
   */
  List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id);


}
