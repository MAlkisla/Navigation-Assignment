package com.example.navigationassignments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationassignments.databinding.FragmentABinding

class AFragment : Fragment() {
    private lateinit var binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        binding.buttonB.setOnClickListener {
            val transition = AFragmentDirections.bTransition()
            Navigation.findNavController(it).navigate(transition)
        }
        return binding.root
    }
}