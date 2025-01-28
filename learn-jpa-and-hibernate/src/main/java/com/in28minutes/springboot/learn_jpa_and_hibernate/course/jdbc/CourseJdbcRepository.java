package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    private final JdbcTemplate jdbcTemplate;
    public CourseJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static String INSERT_QUERY =
            """
            insert into course (id, name, author)
            values(?, ?, ?);
            """;


    public void insert(Course course) {
        // 그냥 단순히 sql 한 줄 실행.
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }
}
