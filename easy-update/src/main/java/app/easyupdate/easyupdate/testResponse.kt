package app.easyupdate.easyupdate


import com.google.gson.annotations.SerializedName

data class testResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("entries")
    val entries: List<Entry>
)