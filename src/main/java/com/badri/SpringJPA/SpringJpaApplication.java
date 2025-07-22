package com.badri.SpringJPA;

import com.badri.SpringJPA.model.Student;
import com.badri.SpringJPA.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJpaApplication.class, args);

		StudentRepo repo =context.getBean(StudentRepo.class);
		Student s1 =context.getBean(Student.class);
		s1.setName("malak");
		s1.setRollno(1);
//		Optional<Student> s=repo.findById(696);
//		System.out.println(s.orElse(new Student()));
		repo.deleteAllById(Arrays.asList(69));
//		repo.save(s1);
	}

}
