package com.submission.dicoding.sensormikrokontroler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.submission.dicoding.sensormikrokontroler.ListSensorDetail.DetailViewHolder

class ListSensorDetail (private val resultSensors: List<DataClassSensors>) : Adapter<DetailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_sensor_detail, parent,false)
        return DetailViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        val itemSensor = resultSensors[position]
        Glide.with(holder.itemView.context)
            .load(itemSensor.image)
            .apply(RequestOptions().override(200,200))
            .into(holder.ivPicture)
        holder.tvName.text = itemSensor.sensor
        holder.tvDescription.text = itemSensor.description
    }

    inner class DetailViewHolder(itemView: View) : ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
        var ivPicture: ImageView = itemView.findViewById(R.id.iv_item_picture)
    }

}
