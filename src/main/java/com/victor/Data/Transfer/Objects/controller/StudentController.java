package com.victor.Data.Transfer.Objects.controller;
import com.victor.Data.Transfer.Objects.dto.StudentAddressDTO;
import com.victor.Data.Transfer.Objects.model.Student;
import com.victor.Data.Transfer.Objects.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/getStudent")
    public List<Student> getAllStudents() {
        return studentService.getAllStudent();
    }

    @PostMapping("/createStudent")
    public ResponseEntity createStudent(@RequestBody StudentAddressDTO studentDTO) {
        return studentService.createStudent(studentDTO);
    }

    @GetMapping("/getStudentById/{studentId}")
    public Student getStudentById(@PathVariable Long studentId ){
        return studentService.getStudentById(studentId);

    }
}