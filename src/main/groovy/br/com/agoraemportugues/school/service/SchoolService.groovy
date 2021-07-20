package br.com.agoraemportugues.school.service

import br.com.agoraemportugues.school.domain.School
import br.com.agoraemportugues.school.repository.SchoolRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SchoolService {
    @Autowired
    SchoolRepository schoolRepository

    List<School> findAll(){
        return schoolRepository.findAll()
    }

    School findByIdOrdered(Long id){
        return schoolRepository.findByIdOrdered(id)
    }

    School create(School school){
        return schoolRepository.save(school)
    }
}
