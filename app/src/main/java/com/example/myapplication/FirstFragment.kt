package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val catButton = view.findViewById<Button>(R.id.catButton)
        val dogButton = view.findViewById<Button>(R.id.dogButton)

        catButton.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_cat_nav_graph)
        }

        dogButton.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_dog_nav_graph)
        }
    }

}