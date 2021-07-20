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
class Subject {
    @Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("subject_id")
    Long id

    @Column(name = "subject_name", nullable = false)
    @JsonProperty(value = "subject_name", required = true)
    String subjectName
}
