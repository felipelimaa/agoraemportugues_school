package br.com.agoraemportugues.school.repository

import br.com.agoraemportugues.school.domain.Subject
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SubjectRepository extends JpaRepository<Subject, Long>{

}