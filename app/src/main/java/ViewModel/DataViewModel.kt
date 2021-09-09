package ViewModel

import Model.Repository.APIService
import Model.Repository.DespDC
import Model.Repository.RetroClass
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataViewModel : ViewModel() {

    val results = MutableLiveData<DespDC>()

    fun getAllDet(): MutableLiveData<DespDC> {

        val apiService: APIService = RetroClass().getAPIService()

        apiService.getAllDetails()
            .enqueue(object : Callback<DespDC> {
                override fun onFailure(call: Call<DespDC>, t: Throwable) {
                    Log.e("SATTY", "onFailure${t.message}")
                }

                override fun onResponse(
                    call: Call<DespDC>,
                    response: Response<DespDC>
                ) {
                    val resultsData = response.body()
                    Log.e("SATTY", ""+ response.body() )


                    results.postValue(resultsData)
                }

            })

        return results
    }

}