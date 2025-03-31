package com.rest_api_CS.Rest_Api_Case_Study.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest_api_CS.Rest_Api_Case_Study.Exception.InvalidIdException;
import com.rest_api_CS.Rest_Api_Case_Study.Service.CourseService;
import com.rest_api_CS.Rest_Api_Case_Study.dto.MessageResponseDto;
import com.rest_api_CS.Rest_Api_Case_Study.model.Course;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	@Autowired
	private MessageResponseDto messageDto;
	@PostMapping("/api/Course/AddCourse")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	@GetMapping("/api/Course/GetAllCourse")
	public List<Course> GetAllCourse() {
		List<Course> list=courseService.GetAllCourse();
		return list;
	}
	@GetMapping("/api/Course/GetById/{id}")
	public ResponseEntity<?> GetByID(@PathVariable int id) {
		try {
			Course course= courseService.GetById(id);
			return ResponseEntity.ok(course);
		}
		catch(InvalidIdException e){
			messageDto.setBody(e.getMessage());
			messageDto.setStatuscode(400);
			return ResponseEntity.status(400).body(messageDto);
		}
	}
}
