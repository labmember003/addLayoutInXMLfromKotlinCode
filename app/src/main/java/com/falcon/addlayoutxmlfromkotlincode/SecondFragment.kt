package com.falcon.addlayoutxmlfromkotlincode

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second2, container, false)
        // Find the LinearLayout within the fragment's layout
        val linearLayout = view.findViewById<LinearLayout>(R.id.my_linear_layout)

        // Create a new TextView and set its properties
        val textView = TextView(context)
        textView.text = "Hello World!"
        textView.setTextColor(Color.BLACK)
        textView.textSize = 35F

        // Add the TextView to the LinearLayout
        linearLayout.addView(textView)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
    }

}