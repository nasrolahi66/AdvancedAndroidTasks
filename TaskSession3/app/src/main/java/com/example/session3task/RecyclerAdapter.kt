package com.example.session3task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class RecyclerAdapter(val names:List<String>,val clickListener:(String)->Unit): RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return  RecyclerViewHolder(v,clickListener)
    }

    override fun getItemCount(): Int= names.size


    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.onBind(names[position])
    }

    class RecyclerViewHolder(val item: View,val listener: (String)->Unit) : RecyclerView.ViewHolder(item)
    {
       fun onBind(name:String){
           item.txtName.text=name

           item.setOnClickListener(){
              listener(name)
           }
       }

    }
}