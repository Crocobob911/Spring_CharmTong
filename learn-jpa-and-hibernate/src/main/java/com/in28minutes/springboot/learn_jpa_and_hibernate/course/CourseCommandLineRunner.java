package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    private CourseJdbcRepository repo;
    private CourseSpringDataJpaRepository repo;

    public CourseCommandLineRunner(CourseSpringDataJpaRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Course(1, "OOP", "BongBong"));
        repo.save(new Course(2, "PLT", "SungSung"));
        repo.save(new Course(3, "DBA", "HoonHoon"));

        repo.deleteById(2l);

        System.out.println(repo.findById(1l));
        System.out.println(repo.findById(3l));
    }
}
