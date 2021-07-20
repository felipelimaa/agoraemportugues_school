package br.com.agoraemportugues.school.domain

import com.fasterxml.jackson.annotation.JsonProperty

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    @JsonProperty("student_id")
    Long id

    @Column(name = "student_name", nullable = false)
    @JsonProperty(value = "student_name", required = true)
    String studentName

    @Column(name = "student_age", nullable = false)
    @JsonProperty(value = "age", required = true)
    Integer age
}
