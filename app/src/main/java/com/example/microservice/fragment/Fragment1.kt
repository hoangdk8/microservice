/*
 * *
 *  * Created by Admin on 12:01, 12/01/2024
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 12:00, 12/01/2024
 *
 */

package com.example.microservice.fragment

import android.os.Bundle
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.example.microservice.databinding.Fragment1Binding
import com.example.microservice.R
import com.koai.base.ui.fragment.BaseFragment


class Fragment1 : BaseFragment() {
private lateinit var binding: Fragment1Binding
    override fun getBindingView(container: ViewGroup?): ViewBinding {
        binding = Fragment1Binding.inflate(layoutInflater,container,false)
       return binding
    }

    private fun setupViews() {
        binding.buttonFragment2.setOnClickListener {
            val newFragment = Fragment2()
            val fragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, newFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.buttonFragment3.setOnClickListener {
            val newFragment = Fragment3()
            val fragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, newFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.buttonFragment4.setOnClickListener {
            val newFragment = Fragment4()
            val fragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, newFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

    override fun initView(savedInstanceState: Bundle?, binding: ViewBinding) {

        setupViews()
    }

}