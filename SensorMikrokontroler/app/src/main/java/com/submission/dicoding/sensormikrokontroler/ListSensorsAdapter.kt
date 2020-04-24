package com.submission.dicoding.sensormikrokontroler

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.*
import com.submission.dicoding.sensormikrokontroler.ListSensorsAdapter.ListViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSensorsAdapter(private val resultSensors: List<DataClassSensors>) : Adapter<ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_sensors, parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return resultSensors.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val itemSensor = resultSensors[position]
        Glide.with(holder.itemView.context)
            .load(itemSensor.image)
            .apply(RequestOptions().override(60,60))
            .into(holder.ivPicture)
        holder.tvName.text = itemSensor.sensor
        holder.tvDescription.text = itemSensor.description

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(resultSensors[holder.adapterPosition]) }
    }

    inner class ListViewHolder(itemView: View) : ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
        var ivPicture: ImageView = itemView.findViewById(R.id.iv_item_picture)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: DataClassSensors)
    }
}
