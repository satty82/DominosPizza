package Model.Repository

import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetroClass {

    var ROOTURL = "  https://android.free.beeceptor.com/"

    fun getRetroInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(ROOTURL)
            .addConverterFactory(GsonConverterFactory.create()).build()

    }

    fun getAPIService(): APIService {
        return getRetroInstance().create()
    }




}