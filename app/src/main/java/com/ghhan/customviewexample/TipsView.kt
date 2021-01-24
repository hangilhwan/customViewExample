package com.ghhan.customviewexample

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.item_tips_view.view.*


/* ImageとTextviewがある簡単なCustomView*/

class TipsView constructor(context: Context, tipsItem: TipsItem) : LinearLayout(context) {

    init {
        val isUrlNotEmpty = tipsItem.url.isNotEmpty()
        LayoutInflater.from(context).inflate(R.layout.item_tips_view, this)

        tips_text_view.text = tipsItem.text
        rootView.setOnClickListener {
            if (isUrlNotEmpty) {
                context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(tipsItem.url)))
            }
        }
        tips_image_view.visibility = if (isUrlNotEmpty) View.VISIBLE else View.GONE
    }
}