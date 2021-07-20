package br.com.agoraemportugues.school.service

import br.com.agoraemportugues.school.domain.Student
import br.com.agoraemportugues.school.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {
    @Autowired
    StudentRepository studentRepository

    List<Student> findAll() {
        return studentRepository.findAll()
    }

    Student create(Student student) {
        return studentRepository.save(student)
    }
}
