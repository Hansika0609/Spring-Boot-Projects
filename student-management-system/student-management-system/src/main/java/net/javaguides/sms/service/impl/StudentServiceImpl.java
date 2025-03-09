package net.javaguides.sms.service.impl;

import net.javaguides.sms.dto.StudentDto;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return List.of();
    }

    @Override
    public void createStudent(StudentDto student) {

    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        return null;
    }

    @Override
    public void updateStudent(StudentDto studentDto) {

    }

    @Override
    public void deleteStudent(Long studentId) {

    }
}
