package br.com.agoraemportugues.school.controller

import br.com.agoraemportugues.school.domain.Student
import br.com.agoraemportugues.school.service.StudentService
import org.apache.coyote.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("students")
class StudentController {
    @Autowired
    StudentService studentService

    @GetMapping
    ResponseEntity<Student> findAll() {
        List<Student> students = studentService.findAll()
        return ResponseEntity.ok(students)
    }

    @PostMapping
    ResponseEntity<Student> create(@RequestBody Student student) {
        Student studentAdded = studentService.create(student)
        return ResponseEntity.status(HttpStatus.CREATED).body(studentAdded)
    }
}
