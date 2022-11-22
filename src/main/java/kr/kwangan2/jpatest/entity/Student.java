package kr.kwangan2.jpatest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude="professor")
public class Student {
	
	public Student() {
		
	}
	
	public Student(String id, String name, Professor professor) {
		this.id=id;
		this.name=name;
		this.professor=professor;
	}
	
	@Id
	private String id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="PROFESSOR_ID", nullable=false)
	private Professor professor;
	
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
		professor.getStudentList().add(this);
		
	}
	
}
