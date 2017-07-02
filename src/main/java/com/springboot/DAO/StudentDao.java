package com.springboot.DAO;

import com.springboot.Entity.Student;

import java.util.Collection;

/**
 * Created by sivashashank on 7/2/17.
 */

public interface StudentDao {
    Collection<Student> getAllStudents();

    void  removeById(int id);

    Student getById(int id);

    void insertStudenttoDb(Student student);

    void updateStudent(Student student);
}
