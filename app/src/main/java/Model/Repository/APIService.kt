package Model.Repository

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    @GET("pizzas")
    fun getAllDetails(): Call<DespDC>
    //EndPoint


}