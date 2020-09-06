package com.example.CourseCrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseCrud.exception.ResourceNotFoundException;
import com.example.CourseCrud.model.Course;
import com.example.CourseCrud.repository.CourseRepository;

@RestController
@RequestMapping("/Api")
public class CourseController {
	
	
	@Autowired
	CourseRepository courseRepository;
	
	
	
	@RequestMapping(value="/courses",method=RequestMethod.GET)
	public List<Course> getAllCourse(){
		return courseRepository.findAll();
	}
	
	@RequestMapping(value="/course",method=RequestMethod.POST)
	public Course createCourse(@RequestBody Course course) {
		return courseRepository.save(course);
		
	}
	
	@RequestMapping(value="/course/{id}")
	public Course getCourseById(@PathVariable(value="id")Long courseId) {
		return courseRepository.findById(courseId)
				.orElseThrow(()->new ResourceNotFoundException("Course","id",courseId));
	}


	@RequestMapping(value="/course/{id}",method=RequestMethod.PUT)
	public Course UpdateCourse(@PathVariable(value="id")Long courseId,@RequestBody Course coursedetails) {
	Course course=courseRepository.findById(courseId)
	.orElseThrow(()->new ResourceNotFoundException("Course","id",courseId));
	course.setCoursename(coursedetails.getCoursename());
	course.setCoursecontent(coursedetails.getCoursecontent());
	Course updateCourse=courseRepository.save(course);
	return updateCourse;
}
}