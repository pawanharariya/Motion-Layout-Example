package com.example.motionlayoutexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class TitleFragment : Fragment() {
    private lateinit var animationOneButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_title, container, false)
        animationOneButton = root.findViewById(R.id.animation_one_button)
        animationOneButton.setOnClickListener {
            findNavController().navigate(R.id.action_titleFragment_to_animationOneFragment)
        }
        return root
    }
}