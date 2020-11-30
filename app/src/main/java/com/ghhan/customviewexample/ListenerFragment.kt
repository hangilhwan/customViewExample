package com.ghhan.customviewexample

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_listener.*


class ListenerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listener, container, false)
    }

    companion object {
        private const val POST_NUM_MAX_LENGTH = 3
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }


    private fun initView() {
        //ClickListener
        buttonTest.setOnClickListener {
            Toast.makeText(requireContext(), "Button Test", Toast.LENGTH_LONG).show()
        }

        //TextChangedListener
        postNum1.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (postNum1.text?.length == POST_NUM_MAX_LENGTH) {//size as per your requirement
                    postNum2.requestFocus()
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable) {}
        })

        //RadioButton OnCheckedChangeListener
        radioGroup.setOnCheckedChangeListener { _, id ->
            when (id) {
                R.id.radio1 -> Toast.makeText(
                    requireContext(),
                    "selected Radio 1",
                    Toast.LENGTH_LONG
                ).show()
                R.id.radio2 -> Toast.makeText(
                    requireContext(),
                    "selected Radio 2",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        //Switch
        switchTest.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(
                requireContext(),
                "Switch is " + if (isChecked) "on" else "off",
                Toast.LENGTH_SHORT
            ).show()
        }

        //Seekbar
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(sb: SeekBar?, progress: Int, bo: Boolean) {
                seekBarTextView.text = progress.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
    }
}