package com.accidentaldeveloper.scrollanime

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_anime_detail.view.*
import kotlinx.android.synthetic.main.animecard.view.*

class Animeadapter(var Anime:List<AnimeData>):RecyclerView.Adapter<Animeadapter.myViewHolder>() {


    inner class myViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
         var anime_Name = itemView.animeName
         var char_Name = itemView.charName
        var anime_Img = itemView.animeImg
        var watch_Hour = itemView.watchHour
        var rating = itemView.star



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var animeView = LayoutInflater.from(parent.context).inflate(R.layout.animecard,parent,false)
        return myViewHolder(animeView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.anime_Name.text = Anime[position].animeName
        holder.char_Name.text = Anime[position].charName
        holder.anime_Img.setImageResource(Anime[position].animeImg)
        holder.watch_Hour.text = Anime[position].watchHour.toString()
        holder.rating.text = Anime[position].star.toString()
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,AnimeDetail::class.java)
            intent.putExtra("info",Anime[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
    return Anime.size
    }
}