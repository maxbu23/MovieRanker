package zti.project.movieranker.model

import jakarta.persistence.*;

@Entity
data class Movie(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val originalTitle: String,
    val englishTitle: String,
    val director: String,
    val averageRate: Double,
    val posterUrl: String,
)
