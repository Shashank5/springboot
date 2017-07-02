package com.springboot.Service;

import com.springboot.Entity.Student;

import java.util.Collection;
import com.springboot.DAO.StudentDAOImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by sivashashank on 7/2/17.
 */

@Service
public class StudentService {

    @Autowired
    @Qualifier("data")
    private StudentDAOImp studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getById(int id){
        return studentDao.getById(id);
    }

    public void removeById(int id){
        this.studentDao.removeById(id);
    }

    public void updateStudent(Student student){
       this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student){
        this.studentDao.insertStudenttoDb(student);
    }


}
