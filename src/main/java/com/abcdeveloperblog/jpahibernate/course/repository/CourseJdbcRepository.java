package com.abcdeveloperblog.jpahibernate.course.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abcdeveloperblog.jpahibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT_QUERY = """
			insert into course (id, name, author)
			values (1, 'JDBC Example', 'JDBC Author')
			""";
	private static String INSERT_QUERY_DYNAMIC = """
			insert into course (id, name, author)
			values (?, ?, ?)
			""";
	private static String DELETE_QUERY = """
			delete from course
			where id=?
			""";
	private static String SELECT_QUERY = """
			select * from course
			where id=?
			""";
	public void insert() {
		jdbcTemplate.update(INSERT_QUERY);
	}
	public void insertDynamic(Course course) {
		jdbcTemplate.update(INSERT_QUERY_DYNAMIC, 
				course.getId(), course.getName(), course.getAuthor());
	}
	public void deleteById(long id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}
}
