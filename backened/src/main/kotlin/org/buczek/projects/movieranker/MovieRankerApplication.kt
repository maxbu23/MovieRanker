package org.buczek.projects.movieranker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MovieRankerApplication

fun main(args: Array<String>) {
	runApplication<MovieRankerApplication>(*args)
}
