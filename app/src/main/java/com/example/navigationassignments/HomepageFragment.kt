package com.example.navigationassignments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationassignments.databinding.FragmentHomepageBinding

class HomepageFragment : Fragment() {

    private lateinit var binding: FragmentHomepageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomepageBinding.inflate(inflater, container, false)

        binding.buttonA.setOnClickListener {
            val transition = HomepageFragmentDirections.aTransition()
            Navigation.findNavController(it).navigate(transition)

        }
        binding.buttonX.setOnClickListener {
            val transition = HomepageFragmentDirections.xTransition()
            Navigation.findNavController(it).navigate(transition)
        }
        return binding.root
    }

}