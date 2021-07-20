package br.com.agoraemportugues.school.repository

import br.com.agoraemportugues.school.domain.School
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface SchoolRepository extends PagingAndSortingRepository<School, Long> {
    @Query(value = "SELECT * FROM school s where s.school_id = :id", nativeQuery = true)
    School findByIdOrdered(@Param("id") Long id)
}
