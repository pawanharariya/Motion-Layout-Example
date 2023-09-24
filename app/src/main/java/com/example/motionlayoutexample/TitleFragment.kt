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
    private lateinit var animationTwoButton: Button
    private lateinit var animationThreeButton: Button
    private lateinit var animationFourButton: Button
    private lateinit var animationFiveButton: Button
    private lateinit var animationSixButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_title, container, false)

        animationOneButton = root.findViewById(R.id.animation_one_button)
        animationTwoButton = root.findViewById(R.id.animation_two_button)
        animationThreeButton = root.findViewById(R.id.animation_three_button)
        animationFourButton = root.findViewById(R.id.animation_four_button)
        animationFiveButton = root.findViewById(R.id.animation_five_button)
        animationSixButton = root.findViewById(R.id.animation_six_button)

        animationOneButton.setOnClickListener {
            navigate(R.id.action_titleFragment_to_animationOneFragment)
        }
        animationTwoButton.setOnClickListener {
            navigate(R.id.action_titleFragment_to_animationTwoFragment)
        }
        animationThreeButton.setOnClickListener {
            navigate(R.id.action_titleFragment_to_animationThreeFragment)
        }
        animationFourButton.setOnClickListener {
            navigate(R.id.action_titleFragment_to_animationOneFragment)
        }
        animationFiveButton.setOnClickListener {
            navigate(R.id.action_titleFragment_to_animationOneFragment)
        }
        animationSixButton.setOnClickListener {
            navigate(R.id.action_titleFragment_to_animationOneFragment)
        }
        return root
    }

    private fun navigate(action: Int) {
        findNavController().navigate(action)
    }
}