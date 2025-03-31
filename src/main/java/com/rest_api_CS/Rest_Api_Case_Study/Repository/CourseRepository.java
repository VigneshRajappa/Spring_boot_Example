package com.rest_api_CS.Rest_Api_Case_Study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest_api_CS.Rest_Api_Case_Study.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
