package com.staskost.projection.modelProjections;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.staskost.projection.model.Course;
import com.staskost.projection.model.Student;

	@Projection(
			  name = "projectedtudent", 
			  types = { Student.class })
	public interface ProjectedStudent {

		String getFirstName();
		
		String getLastName();
		
		List<Course> getCourses();
		
		@Value("#{target.getCourses().size()}")
	    int getCoursesCount();

	}


