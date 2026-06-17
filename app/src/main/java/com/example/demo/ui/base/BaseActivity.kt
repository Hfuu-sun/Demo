package com.example.demo.ui.base

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.demo.R

abstract class BaseActivity<T: ViewDataBinding> : AppCompatActivity() {
    protected lateinit var viewDataBinding: T
    protected abstract val layoutResId: Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding= DataBindingUtil.setContentView(this,layoutResId)
        setUp()
    }
    protected abstract fun setUp()
}