package com.dif4202_0083.miwokdata_jurnal09

import com.google.gson.annotations.SerializedName

data class MiwokData(
    @SerializedName("defaultWord")
    val defaultWordd: String,
    @SerializedName("miwokWord")
    val miwokWordd: String,
    @SerializedName("image")
    val imagee: String

)