package com.accidentaldeveloper.scrollanime

import android.os.Parcel
import android.os.Parcelable

data class AnimeData(
    val id:Int?,
    val animeName:String?,
    val charName:String?,
    val watchHour:Int?,
    val star:Int?,
    val overview:String?,
    val animeImg:Int,
    val img:Int
    ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(animeName)
        parcel.writeString(charName)
        parcel.writeValue(watchHour)
        parcel.writeValue(star)
        parcel.writeString(overview)
        parcel.writeInt(animeImg)
        parcel.writeInt(img)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AnimeData> {
        override fun createFromParcel(parcel: Parcel): AnimeData {
            return AnimeData(parcel)
        }

        override fun newArray(size: Int): Array<AnimeData?> {
            return arrayOfNulls(size)
        }
    }
}


