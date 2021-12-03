package com.victor.Data.Transfer.Objects.repository;

import com.victor.Data.Transfer.Objects.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
