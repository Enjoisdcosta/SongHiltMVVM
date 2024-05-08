package com.example.songhiltmvvm.ui.song

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.songhiltmvvm.R
import com.example.songhiltmvvm.data.model.ResultModel
import com.example.songhiltmvvm.data.model.SongsModel
import com.example.songhiltmvvm.databinding.ItemSongBinding
import com.example.songhiltmvvm.databinding.TestBinding
class SongAdapter(
    val songList: List<ResultModel>
) : RecyclerView.Adapter<SongAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemSongBinding.bind(itemView)
        fun updateUI(songItemModel: ResultModel) {
            // handle the ui changes based on current data
            binding.apply {
                Glide.with(itemView.context).load(songItemModel.artistViewUrl)
                    .placeholder(R.drawable.people_icon)
                    .into(ivProfile)
                tvFirstName.text = songItemModel.trackName
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false)
        )
    }

    override fun getItemCount() = songList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.updateUI(songList[position])
    }
}


