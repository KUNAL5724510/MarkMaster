package MarkMaster.com.MarkMaster.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MarkMaster.com.MarkMaster.Entity.Student;
import MarkMaster.com.MarkMaster.Repository.student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/student")
public class Cstudent {
   
    @Autowired
    private student studentRepo;

    @PostMapping("/add") 
    public String addStudent(@RequestBody Student studentd) {
        // Create a new Student object and set its properties
       studentRepo.save(studentd);
        return "Student added successfully!";

}
}