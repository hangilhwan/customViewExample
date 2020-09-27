package com.ghhan.customviewexample

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.item_custom_view.view.*

/* ImageとTextviewがある簡単なCustomView*/

class CustomView constructor(context: Context, customItem: CustomItem) : LinearLayout(context) {

    init {
        //Viewの設定
        LayoutInflater.from(context).inflate(R.layout.item_custom_view, this)

        //customItemからViewを設定する、レイアウトは「R.layout.item_custom_view」を参照
        custom_image_view.setImageResource(customItem.imageResources)
        custom_text_view.setText(customItem.text)
    }
}