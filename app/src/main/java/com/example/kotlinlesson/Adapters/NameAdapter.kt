package com.example.kotlinlesson.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlesson.Model.NameModel
import com.example.kotlinlesson.OnClick
import com.example.kotlinlesson.R

class NameAdapter(private val listText: MutableList<NameModel>, private val onClick: OnClick) :
    RecyclerView.Adapter<NameAdapter.TextViewHolder>() {

    inner class TextViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var textMain: TextView? = null

        init {
            textMain = view.findViewById(R.id.text_main)
        }

        fun onBind(textModel: NameModel) {
            textMain?.text = textModel.text

            itemView.setOnClickListener {
                onClick.OnClikItem(textModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        return TextViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_name, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.onBind(listText[position])
    }

    override fun getItemCount(): Int = listText.size
}