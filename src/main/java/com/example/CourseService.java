package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	
	public List<Course> getAllCourses(String id){
		
		//return Courses;
		
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		
		//return Courses.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		return courseRepository.findOne(id);
	}

	public void addCourse(Course Course) {
		
		//Courses.add(Course);
		
		courseRepository.save(Course);
		
	}

	public void updateCourse(Course Course) {
		
		/*for(int i =0; i < Courses.size();i++){
			
			Course t = Courses.get(i);
			
			if(t.getId().equals(id)){
				
				Courses.set(i, Course);
				return;
			}
			
		}*/
		
		courseRepository.save(Course);
		
	}

	public void deleteCourse(String id) {
		
		//Courses.removeIf(t->t.getId().equals(id));
		courseRepository.delete(id);
		
	}

}
