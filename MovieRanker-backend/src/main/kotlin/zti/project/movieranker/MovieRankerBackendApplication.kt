package zti.project.movieranker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MovieRankerBackendApplication

fun main(args: Array<String>) {
    runApplication<MovieRankerBackendApplication>(*args)
}
