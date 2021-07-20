package br.com.agoraemportugues.school.service

import br.com.agoraemportugues.school.domain.Subject
import br.com.agoraemportugues.school.repository.SubjectRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SubjectService {
    @Autowired
    SubjectRepository subjectRepository

    List<Subject> findAll() {
        return subjectRepository.findAll()
    }

    Subject create(Subject subject){
        return subjectRepository.save(subject)
    }
}
