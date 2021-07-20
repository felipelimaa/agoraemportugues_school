package br.com.agoraemportugues.school.controller

import br.com.agoraemportugues.school.domain.Team
import br.com.agoraemportugues.school.service.TeamService
import org.apache.coyote.Response
import org.springframework.beans.factory.annotation.Autowire
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("teams")
class TeamController {
    @Autowired
    TeamService teamService

    @GetMapping
    ResponseEntity<Team> findAll(){
        List<Team> teams = teamService.findAll()
        return ResponseEntity.ok(teams)
    }

    @PostMapping
    ResponseEntity<Team> create(@RequestBody Team team) {
        Team teamAdded = teamService.create(team)
        return ResponseEntity.status(HttpStatus.CREATED).body(team)
    }
}
