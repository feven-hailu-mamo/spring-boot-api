package com.springboot.demo.courseapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.courseapi.model.Course;
import com.springboot.demo.courseapi.repo.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	public Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null);
   }

	public void addCourse(Course Course) {
		courseRepository.save(Course);
	}

	public void updateCourse(Course Course) {
		courseRepository.save(Course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
