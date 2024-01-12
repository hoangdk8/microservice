package com.example.microservice.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.example.microservice.databinding.ActivityMainBinding
import com.example.microservice.R
import com.example.microservice.fragment.Fragment1
import com.koai.base.ui.activity.BaseActivity

class MainActivity : BaseActivity() {

    override fun getBindingView(): ViewBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initView(savedInstanceState: Bundle?, binding: ViewBinding) {
        addFragment(Fragment1(), R.id.fragment_container)
    }
}