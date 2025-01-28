package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public void insert(Course course) {
        em.merge(course);
    }

    public Course findById(long id){
        return em.find(Course.class, id);
    }

    public void deleteById(long id){
        Course course = em.find(Course.class, id);
        em.remove(course);
    }
}
