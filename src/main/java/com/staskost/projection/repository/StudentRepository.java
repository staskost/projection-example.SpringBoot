package com.staskost.projection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.staskost.projection.model.Student;
import com.staskost.projection.modelProjections.ProjectedStudent;

@RepositoryRestResource(excerptProjection = ProjectedStudent.class)
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
