package com.learn.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.learn.test.databinding.FragmentFourBinding


class Four : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentFourBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_four, container, false)

        binding.btnNext.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_four_to_second)
        )
        return binding.root
    }

}