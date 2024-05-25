package zti.project.movieranker.service

import org.apache.coyote.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.exchange

@Service
class ExternalMoviesApi(@Autowired private val restTemplate: RestTemplate) {

    @Value("\${api.access.token.auth}")
    private lateinit var accessTokenAuth: String

    fun getMovieByTitle(title: String) {
        val url = "https://api.themoviedb.org/3/search/movie?query=$title";
        val httpHeaders =  HttpHeaders();
        httpHeaders.set("Authorization", "Bearer $accessTokenAuth")
        val httpEntity = HttpEntity<String>(httpHeaders);
        val response = restTemplate.exchange<String>(
            url,
            HttpMethod.GET,
            httpEntity
        )

        println(response.body)
    }

}