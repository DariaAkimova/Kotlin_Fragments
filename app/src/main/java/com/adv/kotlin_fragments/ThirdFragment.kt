package com.adv.kotlin_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.adv.kotlin_fragments.databinding.FragmentFirstBinding
import com.adv.kotlin_fragments.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonTo13.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_thirdFragment_to_firstFragment)
        }

        binding.buttonTo23.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }
}