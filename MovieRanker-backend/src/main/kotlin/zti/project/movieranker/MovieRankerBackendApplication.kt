package zti.project.movieranker

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import zti.project.movieranker.service.ExternalMoviesApi


@SpringBootApplication
class MovieRankerBackendApplication(@Autowired private val externalMoviesApi: ExternalMoviesApi) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Hello, World!")
        externalMoviesApi.getMovieByTitle("The Matrix")
    }
}
fun main(args: Array<String>) {
    runApplication<MovieRankerBackendApplication>(*args)
}
