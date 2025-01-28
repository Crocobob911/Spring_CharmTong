package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import com.in28minutes.springboot.learn_jpa_and_hibernate.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    private CourseJdbcRepository repo;

    private CourseJpaRepository repo;

    public CourseCommandLineRunner(CourseJpaRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        repo.insert(new Course(1, "OOP", "BongBong"));
        repo.insert(new Course(2, "PLT", "SungSung"));
        repo.insert(new Course(3, "DBA", "HoonHoon"));

        repo.deleteById(2);

        System.out.println(repo.findById(1));
        System.out.println(repo.findById(3));
    }
}
