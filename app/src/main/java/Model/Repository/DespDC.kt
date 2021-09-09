package Model.Repository

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class DespDC(
        @SerializedName("name") val name: String? = null,
        @SerializedName("isVeg") val isVeg: Boolean?,
        @SerializedName("defaultCrust") val defaultCrust: Int? = null,
        @SerializedName("description") val description: String? = null,
        @SerializedName("crusts") val crusts: ArrayList<Crusts>? = null


) : Serializable


data class Crusts(

        @SerializedName("id") var id: Int? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("defaultSize") var defaultSize: Int? = null,
        @SerializedName("sizes") var sizes: ArrayList<Sizes>? = null

        ) : Serializable

data class Sizes(

        @SerializedName("id") var id: Int? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("price") var price: Int? = null,

)