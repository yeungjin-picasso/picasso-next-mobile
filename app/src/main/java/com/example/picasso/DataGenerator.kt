package com.example.picasso

import android.util.Log

data class DiaryImage(val DiaryId: Int, val ImageURL: String)

class DataGenerator{
    companion object{
        @JvmStatic
        fun get(type: String): MutableList<DiaryImage> {
            Log.d("test", type)
            //여기서 이미지 URL전부 가져온다.
            val list = MutableList(31) {
                DiaryImage(1, "https://picaboonftimage.s3.ap-northeast-2.amazonaws.com/avocado.jpg")
            }
//            val list = mutableListOf<String>()
//            list.add("test")
            return list
        }
    }
}
