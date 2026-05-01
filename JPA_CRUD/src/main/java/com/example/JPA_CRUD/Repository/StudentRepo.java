package com.example.JPA_CRUD.Repository;
import com.example.JPA_CRUD.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
