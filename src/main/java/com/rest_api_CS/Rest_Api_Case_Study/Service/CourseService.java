package com.rest_api_CS.Rest_Api_Case_Study.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest_api_CS.Rest_Api_Case_Study.Exception.InvalidIdException;
import com.rest_api_CS.Rest_Api_Case_Study.Repository.CourseRepository;
import com.rest_api_CS.Rest_Api_Case_Study.model.Course;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}
	public List<Course> GetAllCourse() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}
	public Course GetById(int id) throws InvalidIdException {
		Optional<Course> optional=courseRepository.findById(id);
		if(optional.isEmpty()) 
			throw new InvalidIdException("Id given is Invalid");
		return optional.get();
	}

}
