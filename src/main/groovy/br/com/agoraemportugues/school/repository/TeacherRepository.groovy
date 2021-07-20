package br.com.agoraemportugues.school.repository

import br.com.agoraemportugues.school.domain.Teacher
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TeacherRepository extends JpaRepository<Teacher, Long>{

}