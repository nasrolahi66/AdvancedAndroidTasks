package com.example.task2_advance

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class RecyclerAdapter(val menu:ArrayList<String>,val rInterface:RecyclerInterface): RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {
    override fun getItemCount(): Int {

        return menu.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.onBind(menu[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
      val v=  LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return RecyclerViewHolder(v,rInterface)

    }


    class  RecyclerViewHolder(val item : View,val rInterface: RecyclerInterface) : RecyclerView.ViewHolder(item)
    {
      fun onBind(menu:String)
      {
          item.txtMenu.text=menu
          item.setOnClickListener(object:View.OnClickListener{
              override fun onClick(v: View?) {
                  rInterface.onClick(menu)
              }
          })

      }
    }
}