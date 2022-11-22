package kr.kwangan2.jpatest.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.entity.Professor;
import kr.kwangan2.jpatest.entity.Student;
import kr.kwangan2.jpatest.repository.ProfessorRepository;
import kr.kwangan2.jpatest.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfessorRepositoryTest {
	
	@Autowired
	private ProfessorRepository professorRepo;
	
	@Autowired
	private StudentRepository studentRepo;
	
	
	/*
	//----------------------Professor-------------------------
	
	//등록 기능 테스트
	//@Test
	public void testInsertProfessor() {
		
		Professor professor = new Professor("아이디", "이름");
		professorRepo.save(professor);
		
	}
	
	//상세 조회 기능 테스트 
	//@Test
	public void testGetProfessor() {
		Professor professor = professorRepo.findById("아이디").get();
		System.out.println(professor.toString());
	}
	
	//수정 기능 테스트
	//@Test
	public void testUpdateProfessor() {
		System.out.println("===교수 조회===");
		Professor professor = professorRepo.findById("아이디").get();
		
		System.out.println("===교수 이름 수정===");
		professor.setName("juhee shin");
		professorRepo.save(professor);
	}
	
	//삭제 기능 테스트
	//@Test
	public void testDeleteProfessor() {
		professorRepo.deleteById("아이디");
	}
	
	
	//----------------------Student-------------------------
	
	
	//등록 기능 테스트
	//@Test
	public void testInsertStduent() {
		
		Student student = new Student("juhee", "신주희");
		studentRepo.save(student);
		
	}
	
	//상세 조회 기능 테스트 
	//@Test
	public void testGetStduent() {
		Student student = studentRepo.findById("juhee").get();
		System.out.println(student.toString());
	}
	
	//수정 기능 테스트
	//@Test
	public void testUpdateStduent() {
		System.out.println("===학생 조회===");
		Student student = studentRepo.findById("juhee").get();
		
		System.out.println("===학생 이름 수정===");
		student.setName("주희신");
		studentRepo.save(student);
	}
	
	//삭제 기능 테스트
	@Test
	public void testDeleteStduent() {
		studentRepo.deleteById("juhee");
	}
	
	*/
	
	//@Test
	public void testOneToMany() {
	  Professor professor1
	   	= new Professor("professor1","주희");
	  professorRepo.save(professor1);
	   
	  Professor professor2
	   	= new Professor("professor2","정국");
	  professorRepo.save(professor2);
	   
	  Professor professor3
	   	= new Professor("professor3","지은");
	  professorRepo.save(professor3);
	  
	  
	  
	   
	  
   for(int i=1; i<=6; i++) {
    Student student = new Student(
			 "babo1"+i, "bb1", professor1
		 );   
    	student.setProfessor(professor1);
	   }//for
   	professorRepo.save(professor1);
	   	
   	for(int i=1; i<=6; i++) {
	    Student student = new Student(
				 "babo2"+i, "bb2", professor2
			 );   
	    	student.setProfessor(professor2);
		   }//for
	   	professorRepo.save(professor2);
		   	
   	for(int i=1; i<=6; i++) {
	    Student student = new Student(
				 "babo3"+i, "bb3", professor3
			 );   
	    	student.setProfessor(professor3);
		   }//for
	   	professorRepo.save(professor3);
		
		
	}
	
	@Test
	public void testCascadeDelete() {
		professorRepo.deleteById("professor1");
	}
	
	
	
}
