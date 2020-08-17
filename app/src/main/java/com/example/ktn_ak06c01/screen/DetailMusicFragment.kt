package com.example.ktn_ak06c01.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ktn_ak06c01.R
import com.example.ktn_ak06c01.viewmodel.MusicViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_detail_music.*

class DetailMusicFragment : Fragment() {
    lateinit var musicViewModel: MusicViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_music, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        title_detail.text = arguments?.getString("title")
        Picasso.with(this.context).load(arguments?.getString("image")).into(image_detail)
    }

}
