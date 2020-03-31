package com.dif4202_0083.miwokdata_jurnal09


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    @GET("miwok.json")
    fun getSemuaData(): Call<ListMiwokData>
}