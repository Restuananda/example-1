package com.learn.test

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.learn.test.databinding.ActivityMainBinding
import com.learn.test.databinding.FragmentSecondBinding

class Second : Fragment() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSecondBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_second, container, false)
//        trans = activity as transfer

        binding.btnNext.setOnClickListener {
/*            Navigation.createNavigateOnClickListener(R.id.action_second_to_three))
            //Get Data and convert to String
              trans.passData(binding.editName.text.toString())
*/          val nama = binding.editName.text.toString()
            val umur = binding.editUmur.text.toString().toInt()

            //jumlah data
            val tambah = umur + umur
//            val umur = binding.editUmur.text.toString().toInt()
            val action = SecondDirections.actionSecondToThree(nama, umur)
            it.findNavController().navigate(action)

        }

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


