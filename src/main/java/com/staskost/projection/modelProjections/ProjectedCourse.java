package com.staskost.projection.modelProjections;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.staskost.projection.model.Course;
import com.staskost.projection.model.Student;

@Projection(
		  name = "projectedCourse", 
		  types = { Course.class })
public interface ProjectedCourse {

	String getName();
	
	List<Student> getStudents();
	
	@Value("#{target.getStudents().size()}")
    int getStudentsCount();
}
