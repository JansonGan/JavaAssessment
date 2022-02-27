package com.generation.model;

import java.util.List;
import java.util.Map;

public interface Evaluation {
    List<Course> findPassedCourses();

//    List<Course> getEnrolledCourses();
    Map<String, Course> getEnrolledCourses();
}