package com.abcdeveloperblog.jpahibernate.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abcdeveloperblog.jpahibernate.course.Course;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByAuthor(String author);
}
