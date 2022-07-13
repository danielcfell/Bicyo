package com.Daniels.bicyo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTittle: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTittle= itemView.findViewById(R.id.item_title)

        }
    }

    val tittles  = arrayOf("Panecillo","Ruta de las iglesias","Mindo","Carcelen")

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layour,viewGroup,false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(holder: ViewHolder, i: Int) {
        holder.itemTittle.text = tittles[i]
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}