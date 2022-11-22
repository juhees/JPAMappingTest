package kr.kwangan2.jpatest.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude="studentList")
public class Professor {
	
	public Professor() {
		
	}//아래에 있는걸 만들면 기본생성자가 만들어지지 않아서 따로 적어줌
	
	public Professor(String id, String name) {
		this.id=id;
		this.name=name; 
	}
	
	@Id
	@Column(name="PROFESSOR_ID")
	private String id;
	private String name;
	
	@OneToMany(mappedBy="professor", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Student> studentList = new ArrayList<Student>();
	

}
