package com.example.demo.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demo.R
import com.example.demo.databinding.ActivitySingleTopBinding
import com.example.demo.util.LogUtil

class SingleTopActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySingleTopBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingleTopBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LogUtil.d("SingleTopActivity onCreate")
        binding.btnOpenSelf.setOnClickListener {
            startActivity(Intent(this, SingleTopActivity::class.java))
        }
        binding.btnTopFh.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
        override fun onNewIntent(intent: Intent) {
            super.onNewIntent(intent)
            LogUtil.d("SingleTopActivity onNewIntent")
        }

      override fun onStart() {
             super.onStart()
             LogUtil.d("SingleTopActivity onStart")
       }

    override fun onResume() {
        super.onResume()
        LogUtil.d("SingleTopActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtil.d("SingleTopActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtil.d("SingleTopActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.d("SingleTopActivity onDestroy")
    }
}
