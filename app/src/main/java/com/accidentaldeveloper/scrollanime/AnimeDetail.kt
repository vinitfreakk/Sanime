package com.accidentaldeveloper.scrollanime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_anime_detail.*



class AnimeDetail : AppCompatActivity() {
    private lateinit var obj:AnimeData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anime_detail)
        supportActionBar?.hide()
        window.decorView.apply { systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN }
        obj = intent.getParcelableExtra("info")!!
        setanimeInfo(obj)
    }
    fun setanimeInfo(obj:AnimeData){
        overview_info.text = obj.overview
        heroName.text = obj.charName
        seriesName.text = obj.animeName
        watchHour1.text = obj.star.toString()
        star1.text = obj.star.toString()
        animeImg1.setImageResource(obj.img)
    }
}