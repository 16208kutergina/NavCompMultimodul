package ru.modulbank.cat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 * Use the [SplashCatFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SplashCatFragment : Fragment() {

    companion object {
        const val CAT_NAVIGATION = "CAT_NAVIGATION"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_cat, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.apply {
            val catNavigation = getString(CAT_NAVIGATION)
            if (catNavigation == BigCatFragment.ID_FRAGMENT) {
                findNavController().navigate(R.id.action_splashCatFragment_to_bigCatFragment)
            }else{
                findNavController().navigate(R.id.action_splashCatFragment_to_catFragment)
            }
        } ?: findNavController().navigate(R.id.action_splashCatFragment_to_catFragment)
    }
}