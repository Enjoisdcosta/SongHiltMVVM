package com.example.songhiltmvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.songhiltmvvm.data.viewmodel.SongViewModel
import com.example.songhiltmvvm.databinding.ActivityMainBinding
import com.example.songhiltmvvm.ui.song.SongAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: SongViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.fetchSong()

        viewModel.songLiveData.observe(this) {
            Log.i("Song", it.toString())

            binding.rvPeople.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = SongAdapter(it)
            }

        }

    }
}
