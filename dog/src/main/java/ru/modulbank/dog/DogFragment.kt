package ru.modulbank.dog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DogFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bigDogButton = view.findViewById<Button>(R.id.bigDogButton)
        val catButton = view.findViewById<Button>(R.id.catButton)
        val bigCatButton = view.findViewById<Button>(R.id.bigCatButton)

        bigDogButton.setOnClickListener {
            findNavController().navigate(R.id.action_dogFragment_to_bigDogFragment)
        }

        catButton.setOnClickListener {
            findNavController().navigate(R.id.action_dogFragment_to_cat_nav_graph)
        }

        bigCatButton.setOnClickListener {
            //Не можем снавигироваться до нужного фрагмента сразу
            findNavController().navigate(TODO())
        }
    }
}