package kr.kwangan2.jpatest.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpatest.entity.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

}
