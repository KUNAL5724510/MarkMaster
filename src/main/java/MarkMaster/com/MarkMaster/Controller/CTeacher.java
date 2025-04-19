package MarkMaster.com.MarkMaster.Controller;

import MarkMaster.com.MarkMaster.Entity.Teacher;
import MarkMaster.com.MarkMaster.Repository.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/teacher")
public class CTeacher {
    
    @Autowired
    private teacher teacherRepo;

    @PostMapping("/add")
    public String addTeacher(@RequestBody Teacher teacherd) {
        // Create a new Teacher object and set its properties
        teacherRepo.save(teacherd);
        return "Teacher added successfully!";
    }
}
