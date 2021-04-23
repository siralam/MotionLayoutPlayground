package com.example.motionlayoutplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvTop: RecyclerView
    private lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTop = findViewById(R.id.rvTop)
        rv = findViewById(R.id.rv)

        rvTop.adapter = TopAdapter()
        rv.adapter = SimpleAdapter()
    }
}


class TopAdapter: RecyclerView.Adapter<TopAdapter.TopViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopViewHolder {
        return TopViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_top, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TopViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 100
    }

    class TopViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(position: Int) {
        }
    }

}


class SimpleAdapter: RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        return SimpleViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 100
    }

    class SimpleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(position: Int) {
            itemView.findViewById<TextView>(R.id.tvItem).text = position.toString()
        }

    }

}

