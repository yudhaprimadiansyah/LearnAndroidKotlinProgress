package com.dif4202_0083.miwokdata_jurnal09

import com.google.gson.annotations.SerializedName

data class ListMiwokData(
    @SerializedName("data")
    val data: List<MiwokData>
)