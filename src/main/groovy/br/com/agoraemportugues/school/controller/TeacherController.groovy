package br.com.agoraemportugues.school.controller

import br.com.agoraemportugues.school.domain.Teacher
import br.com.agoraemportugues.school.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("teachers")
class TeacherController {
    @Autowired
    TeacherService teacherService

    @GetMapping
    ResponseEntity<Teacher> findAll() {
        List<Teacher> teachers = teacherService.findAll()
        return ResponseEntity.ok(teachers)
    }

    @PostMapping
    ResponseEntity<Teacher> create(@RequestBody Teacher teacher) {
        Teacher teacherAdded = teacherService.create(teacher)
        return ResponseEntity.status(HttpStatus.CREATED).body(teacherAdded)
    }
}
