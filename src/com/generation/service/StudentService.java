package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;
import com.generation.model.Grade;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if (this.students.containsKey(studentId)) {
            return this.students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
      //TODO
        for (String s : students.keySet()) {
            Student student = students.get(s);
            System.out.println(student);
        }

        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        Student student = this.students.get(studentId);
        student.enrollToCourse(course);
    }

}
