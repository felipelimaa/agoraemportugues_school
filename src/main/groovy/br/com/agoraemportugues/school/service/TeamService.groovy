package br.com.agoraemportugues.school.service

import br.com.agoraemportugues.school.domain.Team
import br.com.agoraemportugues.school.repository.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TeamService {
    @Autowired
    TeamRepository teamRepository

    List<Team> findAll() {
        return teamRepository.findAll()
    }

    Team create(Team team){
        return teamRepository.save(team)
    }
}
