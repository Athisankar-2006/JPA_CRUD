package com.example.JPA_CRUD.Service;
import com.example.JPA_CRUD.Model.Student;
import com.example.JPA_CRUD.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepo studentrepo;

    public List<Student> getallstudent() {
        return studentrepo.findAll();

    }


    public void addstudent(Student student) {
        studentrepo.save(student);

    }

    public Student studentbyid(int rollno) {
        return studentrepo.findById(rollno).orElse(new Student());
    }

    public void updatestd(Student student) {
        studentrepo.save(student);
    }

    public void deletestd(int rollno) {
        studentrepo.deleteById(rollno);
    }

    public void deleteall() {
        studentrepo.deleteAll();
    }
}
