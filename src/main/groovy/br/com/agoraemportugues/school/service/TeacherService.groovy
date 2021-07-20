package br.com.agoraemportugues.school.service

import br.com.agoraemportugues.school.domain.Teacher
import br.com.agoraemportugues.school.repository.TeacherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TeacherService {
    @Autowired
    TeacherRepository teacherRepository

    List<Teacher> findAll() {
        return teacherRepository.findAll()
    }

    Teacher create(Teacher teacher) {
        return teacherRepository.save(teacher)
    }
}
