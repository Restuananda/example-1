package com.learn.test

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.learn.test.databinding.FragmentThreeBinding

class Three : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentThreeBinding = DataBindingUtil.inflate(inflater,
        R.layout.fragment_three, container, false)

//        binding.btnNext.setOnClickListener (
//            Navigation.createNavigateOnClickListener(R.id.action_three_to_second))
//        setHasOptionsMenu(true)
        return binding.root
        }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.about, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}