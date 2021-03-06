package com.example.ktn_ak06c01.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.ktn_ak06c01.R
import com.example.ktn_ak06c01.viewmodel.Music
import com.example.ktn_ak06c01.viewmodel.MusicViewModel
import kotlinx.android.synthetic.main.fragment_input_music.*

class InputMusicFragment : Fragment(), View.OnClickListener {
    val musicViewModel by activityViewModels<MusicViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input_music, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        saveButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            saveButton -> {
                val name = name_actress.text.toString()
                val title = music_title.text.toString()
                val image = image_input.text.toString()
                if (name == "" || title == "" || image == "") {
                    Toast.makeText(this.context, "Must be Field", Toast.LENGTH_SHORT).show()
                } else {
                    musicViewModel.addSong(Music(name,title,image))
                    Toast.makeText(this.context, "Data Successfull Added", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }
}