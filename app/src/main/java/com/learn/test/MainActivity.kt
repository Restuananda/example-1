package com.learn.test

import android.content.res.Configuration
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.learn.test.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_second.*

class MainActivity : AppCompatActivity(), transfer {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val second = Second()
        supportFragmentManager.beginTransaction().replace(R.id.main_activity, second).commit()
//        val navController = this.findNavController(R.id.NavHost)
//        NavigationUI.setupActionBarWithNavController(this, navController)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = this.findNavController(R.id.NavHost)
//        return navController.navigateUp()
//    }

    override fun passData(editexti_string: String) {
        val bundle = Bundle()
        bundle.putString("input_text", editexti_string)
        val trasaction = this.supportFragmentManager.beginTransaction()
        val frag = Three()
        frag.arguments = bundle

        trasaction.replace(R.id.main_activity, frag)
        trasaction.addToBackStack(null)
        trasaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        trasaction.commit()
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }
}