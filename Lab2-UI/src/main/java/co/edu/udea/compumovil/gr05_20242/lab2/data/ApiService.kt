package co.edu.udea.compumovil.gr05_20242.lab2.data

import co.edu.udea.compumovil.gr05_20242.lab2.model.News
import retrofit2.http.GET

interface ApiService {
    @GET("news")
    suspend fun getNews(): List<News>
}
