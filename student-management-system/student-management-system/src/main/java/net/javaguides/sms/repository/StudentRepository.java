package net.javaguides.sms.repository;

import net.javaguides.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//get all the crud operations
public interface StudentRepository extends JpaRepository<Student, Long> {
}
