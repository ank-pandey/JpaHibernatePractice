package com.abcdeveloperblog.jpahibernate.commandline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abcdeveloperblog.jpahibernate.course.Course;
import com.abcdeveloperblog.jpahibernate.course.repository.CourseJdbcRepository;
import com.abcdeveloperblog.jpahibernate.course.repository.CourseJpaRepository;
import com.abcdeveloperblog.jpahibernate.course.repository.CourseSpringJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository courseJdbcRepository;
//	@Autowired
//	private CourseJpaRepository courseJpaRepository;
	
	@Autowired
	private CourseSpringJpaRepository springJpaRepository;
	private Integer count = 0;
	@Override
	public void run(String... args) throws Exception {
//		courseJdbcRepository.insert();
//		courseJdbcRepository.insertDynamic(new Course(++count, "Jdbc Test", "Jdbc Author"));
//		courseJdbcRepository.insertDynamic(new Course(++count, "Jdbc8 Test", "Jdbc8 Author"));
//		courseJdbcRepository.insertDynamic(new Course(++count, "Jdbc11 Test", "Jdbc11 Author"));
//		courseJdbcRepository.deleteById(1);
//		System.out.println(courseJdbcRepository.findById(2));
		
		
		
//		courseJpaRepository.insert(new Course(++count, "JPA Test", "JPA Author"));
//		courseJpaRepository.insert(new Course(++count, "JPA2 Test", "JPA8 Author"));
//		courseJpaRepository.insert(new Course(++count, "JaPA11 Test", "JPA11 Author"));
//		courseJpaRepository.deleteById(1);
//		System.out.println(courseJpaRepository.findById(2));
//		System.out.println(courseJpaRepository.findById(3));
		
		springJpaRepository.save(new Course(++count, "JPA Test", "JPA Author"));
		springJpaRepository.save(new Course(++count, "JPA2 Test", "JPA8 Author"));
		springJpaRepository.save(new Course(++count, "JaPA11 Test", "JPA11 Author"));
		springJpaRepository.deleteById(1l);
		System.out.println(springJpaRepository.findById(2l));
		System.out.println(springJpaRepository.findById(3l));
		System.out.println(springJpaRepository.findAll());
		System.out.println(springJpaRepository.findByAuthor("JPA8 Author"));
		System.out.println(springJpaRepository.findByAuthor(""));
	}
}