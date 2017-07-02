package com.springboot.Controller;

import com.springboot.Entity.Student;
import com.springboot.Service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by sivashashank on 7/2/17.
 */

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired   //// for Dependecy Injection purpose
    private StudentService studentService;

    @GetMapping
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable("id") int id){   // @pathVaraible to get the original id value
      return studentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id){
        studentService.removeById(id);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    // @ResponseBody to update we need to read the body that we sent
    public void  deleteById( @RequestBody Student student){
        studentService.updateStudent(student);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    // @ResponseBody to update we need to read the body that we sent
    public void  InsertStuddent( @RequestBody Student student){
        studentService.insertStudent(student);
    }

}
