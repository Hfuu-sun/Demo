package com.example.demo.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demo.R
import com.example.demo.databinding.ActivitySecondBinding
import com.example.demo.util.LogUtil

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtil.d("SecondActivity onCreate")
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username=intent.getStringExtra("username")  //获取上个页面通过Intent传来的参数
        val age=intent.getIntExtra("age",-1)
        binding.tvData.text="username=$username,age=$age"
        binding.btnShowFirst.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FirstFragment()).addToBackStack(null).commit()
            //把fragment_container替换成FirstFragment
        }
        binding.btnShowSecond.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SecondFragment()).addToBackStack(null).commit()
        }
        binding.btnFinish.setOnClickListener {
            finish()  //关闭当前 Activity，把它从栈里销毁，回到上一个页面。
        }
        binding.btnSecondReturn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        if (savedInstanceState==null){  //如果是新建，则默认是FirstFragment
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FirstFragment()).commit()
        }
    }
    override fun onStart() {
        super.onStart()
        LogUtil.d("SecondActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        LogUtil.d("SecondActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtil.d("SecondActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtil.d("SecondActivity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        LogUtil.d("SecondActivity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.d("SecondActivity onDestroy")
    }

}
