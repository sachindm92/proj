package com.firstfewlines.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.firstfewlines.domain.Student;

@Service
public class StudentService {
	Map<Integer, Student> students = new HashMap<Integer, Student>();

    public void addStudent(Student student) throws Exception {
        if(students.containsKey(student.getRollNo())) {
            throw new Exception("Student already exists");
        }
        else {
            students.put(student.getRollNo(), student);
        }
    }

    public Iterable<Student> getStudents(){
        return students.values();
    }

    public Student getStudent(int rollNo) throws Exception {

        if(students.containsKey(rollNo)) {
            return students.get(rollNo);
        }
        else {
            throw new Exception("Student not found");
        }
    }

    public void updateStudent(Student student) throws Exception {
        if(students.containsKey(student.getRollNo())) {
            students.put(student.getRollNo(), student);
        }
        else {
            throw new Exception("Student not found");
        }
    }

    public void deleteStudent(int rollNo) throws Exception {
        if(students.containsKey(rollNo)) {
            students.remove(rollNo);
        }
        else {
            throw new Exception("Student not found");
        }
    }

}
