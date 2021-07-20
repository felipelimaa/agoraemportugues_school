package br.com.agoraemportugues.school.repository

import br.com.agoraemportugues.school.domain.Team
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TeamRepository extends JpaRepository<Team, Long> {

}