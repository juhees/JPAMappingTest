package kr.kwangan2.jpatest.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpatest.entity.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, String>{

}
