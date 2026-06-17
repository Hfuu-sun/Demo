package com.example.demo.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demo.R
import com.example.demo.databinding.ActivitySingleTaskBinding
import com.example.demo.util.LogUtil

class SingleTaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySingleTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingleTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LogUtil.d("SingleTaskActivity onCreate")
        binding.btnOpenSelf.setOnClickListener {
            startActivity(Intent(this, SingleTaskActivity::class.java))
        }
        binding.btnTaskFh.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        LogUtil.d("SingleTaskActivity onNewIntent")
    }

    override fun onStart() {
        super.onStart()
        LogUtil.d("SingleTaskActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        LogUtil.d("SingleTaskActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtil.d("SingleTaskActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtil.d("SingleTaskActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.d("SingleTaskActivity onDestroy")
    }
}
