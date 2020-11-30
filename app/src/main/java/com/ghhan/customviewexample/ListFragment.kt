package com.ghhan.customviewexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }


    private fun initView() {
        /**
         * firstItem = defined in R.layout.fragment_list
         */
        firstItem.setOnClickListener {
            //action_listFragment_to_FirstFragment = defined in navigation.nav_graph.xml
            //navigate is understand backkey action
            this.findNavController().navigate(R.id.action_listFragment_to_FirstFragment)
        }

        /**
         * Practice 1. set clickEvent & navigate SecondItem
         * object : ConstraintLayoutExampleFragment
         * --start--
         */


        /**
         * --end--
         */


    }
}