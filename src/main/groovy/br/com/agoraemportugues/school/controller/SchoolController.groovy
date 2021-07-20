package br.com.agoraemportugues.school.controller

import br.com.agoraemportugues.school.domain.School
import br.com.agoraemportugues.school.service.SchoolService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("schools")
class SchoolController {
    @Autowired
    SchoolService schoolService

    @GetMapping
    ResponseEntity<School> findAll() {
        List<School> schools = schoolService.findAll()
        return ResponseEntity.ok(schools)
    }

    @PostMapping
    ResponseEntity<School> create(@RequestBody School school){
        School schoolAdded = schoolService.create(school)
        return ResponseEntity.status(HttpStatus.CREATED).body(schoolAdded)
    }

    @GetMapping('/id/{id}')
    ResponseEntity<School> findByIdOrdered(@PathVariable("id") Long id){
        School school = schoolService.findByIdOrdered(id)
        return ResponseEntity.ok(school)
    }
}
