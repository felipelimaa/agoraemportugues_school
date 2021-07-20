package br.com.agoraemportugues.school.controller

import br.com.agoraemportugues.school.domain.Subject
import br.com.agoraemportugues.school.service.SubjectService
import org.apache.coyote.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("subjects")
class SubjectController {
    @Autowired
    SubjectService subjectService

    @GetMapping
    ResponseEntity<Subject> findAll(){
        List<Subject> subjects = subjectService.findAll()
        return ResponseEntity.ok(subjects)
    }

    @PostMapping
    ResponseEntity<Subject> create(@RequestBody Subject subject) {
        Subject subjectAdded = subjectService.create(subject)
        return ResponseEntity.status(HttpStatus.CREATED).body(subjectAdded)
    }
}
