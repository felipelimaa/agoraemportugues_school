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
class Teacher {
    @Id
    @Column(name = "teacher_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("teacher_id")
    Long id

    @Column(name = "teacher_name", nullable = false)
    @JsonProperty(value = "teacher_name", required = true)
    String teacherName


}
