package com.example.JPA_CRUD.Controller;

import com.example.JPA_CRUD.Model.Student;
import com.example.JPA_CRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getallstudent(){
       return studentService.getallstudent();
    }

    @PostMapping("/students")
    public String addstudent(@RequestBody Student student){
        studentService.addstudent(student);
        return "added...";
    }

    @GetMapping("/students/{rno}")
    public Student studentgetbyid(@PathVariable("rno") int rollno){
        return studentService.studentbyid(rollno);
    }

    @PutMapping("/students")
    public String updatestd(@RequestBody Student student){
        studentService.updatestd(student);
        return "updated...";
    }

    @DeleteMapping("/students/{rno}")
    public String deletestd(@PathVariable("rno") int rollno){
        studentService.deletestd(rollno);
        return "deleted..";
    }

    @DeleteMapping("/students/clear")
    public String deleteAll(){
        studentService.deleteall();
        return "database cleared..";
    }
}
