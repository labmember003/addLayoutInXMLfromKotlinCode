package com.falcon.addlayoutxmlfromkotlincode

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.falcon.addlayoutxmlfromkotlincode.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        findNavController().navigate(R.id.action_FirstFragment_to_secondFragment)
        val textView = TextView(context)
        textView.text = "Hello World!"
        textView.textSize = 58f // Set font size in scaled pixels
        textView.setTextColor(Color.WHITE)

        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        textView.layoutParams = layoutParams
        binding.root.addView(textView)
        return binding.root
    }
}