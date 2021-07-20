package br.com.agoraemportugues.school.domain

import com.fasterxml.jackson.annotation.JsonProperty

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "school")
class School {
    @Id
    @Column(name="school_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("school_id")
    Long id

    @Column(name="school_name", nullable = false)
    @JsonProperty(value = "school_name", required = true)
    String schoolName

    @Column(name="cnpj", nullable = false, length = 14)
    @JsonProperty(value = "cnpj", required = true)
    BigDecimal cnpj
}
