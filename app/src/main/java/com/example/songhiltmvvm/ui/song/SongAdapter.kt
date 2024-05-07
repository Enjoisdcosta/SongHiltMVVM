package com.example.songhiltmvvm.ui.song

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.songhiltmvvm.R
import com.example.songhiltmvvm.data.model.SongsModel
import com.example.songhiltmvvm.databinding.FragmentSongListBinding

class SongAdapter(val songList: List<SongsModel>,
val function: (SongsModel) -> Unit
) : RecyclerView.Adapter<SongAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = FragmentSongListBinding.bind(itemView)
        fun updateUI(peopleItemModel: SongsModel) {
            // handle the ui changes based on current data
            binding.apply {


            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


    override fun getItemCount() = songList.size
}