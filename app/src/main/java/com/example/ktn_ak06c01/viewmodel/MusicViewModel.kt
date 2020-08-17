package com.example.ktn_ak06c01.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicViewModel : ViewModel() {
    val musicList = mutableListOf(
        Music(
            "Bara Suara",
            "Sendu Melagu",
            "https://3.bp.blogspot.com/-sxDtQMHxduk/V0Fk6GCS8AI/AAAAAAAAJzI/NvbPzdj1ZKsn_SutpicjoZQDDMH88NQlwCLcB/s1600/7.JPG"
        ), Music(
            "Danilla",
            "Berdistraksi",
            "https://pophariini.com/wp-content/uploads/2019/10/danillafingers-1.jpg"
        ), Music(
            ".feast",
            "Paid Milik Rakyat",
            "https://asset-a.grid.id/crop/0x0:0x0/700x0/photo/2018/09/27/170962345.jpg"
        ), Music(
            "Fourtwenty", "Nematomorpha",
            "https://pophariini.com/wp-content/uploads/2018/09/Fourtwnty.jpg"
        )
    )

    val musicLiveData: MutableLiveData<List<Music>> = MutableLiveData(musicList)
    fun addSong(newMusic: Music) {
        musicList.add(newMusic)
        musicLiveData.value = musicList
    }

}