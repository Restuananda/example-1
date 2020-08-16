package com.learn.test

import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.learn.test.databinding.ActivityMainBinding
import com.learn.test.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_second.view.textView

class Second : Fragment() {
    private lateinit var binding : ActivityMainBinding
    val data : Data = Data("restu")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSecondBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_second, container, false
        )

        binding.btnNext.setOnClickListener {v: View ->
//            Navigation.createNavigateOnClickListener(R.id.action_second_to_three))
            v.findNavController().navigate(SecondDirections.actionSecondToThree())
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.about, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


}


