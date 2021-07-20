package br.com.agoraemportugues.school.repository

import br.com.agoraemportugues.school.domain.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository extends JpaRepository<Student, Long>{

}