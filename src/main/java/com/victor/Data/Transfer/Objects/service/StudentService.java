package com.victor.Data.Transfer.Objects.service;

import com.victor.Data.Transfer.Objects.dto.StudentAddressDTO;
import com.victor.Data.Transfer.Objects.model.Address;
import com.victor.Data.Transfer.Objects.model.Student;
import com.victor.Data.Transfer.Objects.repository.AddressRepository;
import com.victor.Data.Transfer.Objects.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AddressRepository addressRepository;

    public ResponseEntity createStudent(StudentAddressDTO studentDTO) {
        if (studentDTO==null){

        }

        Address address=new Address();
        address.setCity(studentDTO.getCity());
        address.setCountry(studentDTO.getCountry());
        address.setState(studentDTO.getState());
        address.setZipCode(studentDTO.getZipCode());
        Address savedAddress=addressRepository.save(address);

        Student student=new Student();
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setPhoneNumber(studentDTO.getPhoneNumber());
        student.setUsername(studentDTO.getUsername());
        student.setAddress(savedAddress);

       Student savedStudent=studentRepository.save(student);

        return ResponseEntity.ok().body(savedStudent);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long studentId) {
        Optional<Student> student= studentRepository.findById(studentId);

        if (student.isPresent()){
            return student.get();
        }
        throw new RuntimeException("Student is not found for the id " + studentId);
    }
}
