package com.generation.model;

import java.util.*;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
//    private List<Course> enrolledCourses;
    private Map<String, Course> enrolledCourses = new HashMap<>();
    private Map<String, Grade> studentGrading = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {

        super( id, name, email, birthDate );

    }

    public float insertGrade(Grade grade) {
       return 0;
    }


    public void enrollToCourse( Course course )
    {
       //TODO to enroll student to the course and add to the list
//        this.enrolledCourses.add(course);
        this.enrolledCourses.put(course.getCode(), course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        // Unable to solve
        return null;
    }

    public String findCourseById(String courseId )
    {
        //TODO
     if (enrolledCourses.containsKey(courseId)) {
         return enrolledCourses.get(courseId).getName();
     }
       return null;
    }

    @Override
    public Map<String, Course> getEnrolledCourses()
    {
       return enrolledCourses;
    }

    @Override
    public String toString()
    {
        String studentCourse = "";

        for (Course key : enrolledCourses.values()) {
           studentCourse += key + "\n";
        }

        return "Student {" + super.toString() + "}" + "\n"
              +  "Enrolled Courses:" + "\n"
                + studentCourse;

    }

}
