package com.loiane.service;

import com.loiane.model.Course;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.http.ResponseEntity;

public interface CourseService {

    List<Course> list();

    ResponseEntity<Course> findById(@NotNull @Positive Long id);

    Course create(@Valid Course course);

    ResponseEntity<Course> update(@NotNull @Positive Long id, @Valid Course course);

    ResponseEntity<Void> delete(@NotNull @Positive Long id);
}