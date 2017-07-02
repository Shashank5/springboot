package com.springboot.DAO;

import com.springboot.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by sivashashank on 7/2/17.
 */

@Repository
@Qualifier("data")
public class StudentDAOImp {

    private static Map<Integer, Student> students;

    static{
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "siva", "CSE"));
                put(2, new Student(2, "Somu", "ECE"));
                put(3, new Student(3, "Sai", "EEE"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getById(int id){
        return this.students.get(id);
    }

    public void  removeById(int id){
         this.students.remove(id);
    }

    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }

    public void insertStudenttoDb(Student student){
        this.students.put(student.getId(), student);

    }
}
