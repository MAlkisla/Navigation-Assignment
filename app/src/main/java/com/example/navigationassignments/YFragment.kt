package com.example.navigationassignments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationassignments.databinding.FragmentYBinding

class YFragment : Fragment() {
    private lateinit var binding: FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYBinding.inflate(inflater, container, false)

        val backButton = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val transition = YFragmentDirections.homepageTransition()
                Navigation.findNavController(requireView()).navigate(transition)
            }

        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backButton)
        return binding.root
    }

}