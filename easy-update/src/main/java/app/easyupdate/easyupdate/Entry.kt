package app.easyupdate.easyupdate


import com.google.gson.annotations.SerializedName

data class Entry(
    @SerializedName("API")
    val aPI: String,
    @SerializedName("Auth")
    val auth: String,
    @SerializedName("Category")
    val category: String,
    @SerializedName("Cors")
    val cors: String,
    @SerializedName("Description")
    val description: String,
    @SerializedName("HTTPS")
    val hTTPS: Boolean,
    @SerializedName("Link")
    val link: String
)