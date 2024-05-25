package zti.project.movieranker.model

import jakarta.persistence.*

@Entity
data class Rate(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long,
    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User,
    @ManyToOne
    @JoinColumn(name = "movie_id")
    val movie: Movie,
    val rate: Int
)
