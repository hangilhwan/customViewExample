package com.ghhan.customviewexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.linearlayout_first
import kotlinx.android.synthetic.main.fragment_tips.*

class TipsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tips, container, false)
    }
    companion object {
        const val EMPTY = ""
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addCustomView()
    }

    private fun addCustomView() {
        // Itemを定義
        val tipsItemList = listOf(
            TipsItem(
                "Frequently used sites",
                EMPTY
            ), TipsItem(
                "Material Design",
                "https://material.io/"
            ), TipsItem(
                "Android Sample",
                "https://developer.android.com/samples"
            ), TipsItem(
                "Kotlin",
                "https://kotlinlang.org/"
            ), TipsItem(
                "Github Rest API ",
                "https://docs.github.com/en/rest"
            ), TipsItem(
                "Retrofit",
                "https://square.github.io/retrofit/"
            ), TipsItem(
                "Picasso image library",
                "https://square.github.io/picasso/"
            ), TipsItem(
                "Glide image library",
                "https://github.com/bumptech/glide"
            ), TipsItem(
                "Realm DB library",
                "https://realm.io/jp/docs/java/latest/"
            ), TipsItem(
                "Room DB library",
                "https://developer.android.com/training/data-storage/room"
            ), TipsItem(
                "Firebase",
                "https://firebase.google.com/"
            )
        )

        for (item in tipsItemList) {
            val tipsView = TipsView(requireContext(), item)
            tips_linear_layout.addView(tipsView)
        }
    }
}