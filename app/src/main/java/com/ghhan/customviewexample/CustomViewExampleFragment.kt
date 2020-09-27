package com.ghhan.customviewexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

class CustomViewExampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addCustomView()
    }

    //Viewを３つ表示する
    private fun addCustomView() {
        // Itemを定義
        val customItemList = listOf(
            CustomItem(
                R.drawable.ic_baseline_airline_seat_individual_suite_24,
                getString(R.string.word_first)
            ),
            CustomItem(
                R.drawable.ic_baseline_airplanemode_active_24,
                getString(R.string.word_second)
            ),
            CustomItem(
                R.drawable.ic_baseline_directions_bike_24,
                getString(R.string.word_third)
            )
        )

        for(item in customItemList){
            val customView = CustomView(requireContext(), item)
            linearlayout_first.addView(customView)
        }
    }
}