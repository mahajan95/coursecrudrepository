package com.example.CourseCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseCrud.model.Course;

@Repository
public interface CourseRepository  extends JpaRepository<Course,Long>{

}
