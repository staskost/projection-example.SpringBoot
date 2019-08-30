package com.staskost.projection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.staskost.projection.model.Course;
import com.staskost.projection.modelProjections.ProjectedCourse;

@RepositoryRestResource(excerptProjection = ProjectedCourse.class)
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
