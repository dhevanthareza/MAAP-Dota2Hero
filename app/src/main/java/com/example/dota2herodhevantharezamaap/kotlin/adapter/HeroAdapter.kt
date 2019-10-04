package com.example.dota2herodhevantharezamaap.kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dota2herodhevantharezamaap.R
import com.example.dota2herodhevantharezamaap.kotlin.activity.DetailActivity
import com.example.dota2herodhevantharezamaap.kotlin.model.Hero
import kotlinx.android.synthetic.main.item_cardview.view.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk27.coroutines.onClick

class HeroAdapter(private val context: Context, private val list: ArrayList<Hero>) : RecyclerView.Adapter<HeroAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_cardview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(hero: Hero) {
            Glide.with(itemView.context)
                    .load(hero.image)
                    .apply(RequestOptions().override(350, 550))
                    .into(itemView.img_item_photo)
            itemView.tv_item_name.text = hero.name
            itemView.onClick {
                itemView.context.startActivity(itemView.context.intentFor<DetailActivity>("HERO" to hero))
            }
            itemView.btn_detail.onClick {
                itemView.context.startActivity(itemView.context.intentFor<DetailActivity>("HERO" to hero))
            }
        }
    }

}