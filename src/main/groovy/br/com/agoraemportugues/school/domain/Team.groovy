package br.com.agoraemportugues.school.domain

import com.fasterxml.jackson.annotation.JsonProperty

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table
class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "team_id")
    @JsonProperty("team_id")
    Long id

    @Column(name = "team_name", nullable = false)
    @JsonProperty(value = "team_name", required = true)
    String teamName

    @OneToOne
    @JoinColumn(name = "school_id", nullable = false)
    School school
}
