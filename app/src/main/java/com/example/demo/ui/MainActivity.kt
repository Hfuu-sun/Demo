package com.example.demo.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.databinding.ActivityMainBinding
import com.example.demo.util.LogUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) { //Activity重建时，系统回传给你的上一次页面临时状态数据包
        super.onCreate(savedInstanceState)
        LogUtil.d("MainActivity onCreate")
        binding=ActivityMainBinding.inflate(layoutInflater)  //使用当前 Activity 的布局加载器，把这个 XML 布局创建成内存里的 View 对象。
        setContentView(binding.root)  //把视图绑定生成的根布局，设为当前 Activity 要显示的界面
        binding.btnJumpSecond.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.btnJumpSingleTop.setOnClickListener {
            startActivity(Intent(this, SingleTopActivity::class.java))
        }
        binding.btnJumpSingleTask.setOnClickListener {
            startActivity(Intent(this, SingleTaskActivity::class.java))
        }
        binding.btnJumpWithData.setOnClickListener {
         val intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("username","jason")
            intent.putExtra("age",18)
            startActivity(intent)
        }
        binding.btnJumpGas.setOnClickListener {
            startActivity(Intent(this, OilPreferenceDemoActivity::class.java))
        }
        binding.btnJumpGasList.setOnClickListener {
            startActivity(Intent(this, GasStationListActivity::class.java))
        }
        binding.btnJumpChargingList.setOnClickListener {
            startActivity(Intent(this, ChargingStationListActivity::class.java))
        }
        }

    override fun onStart() {
        super.onStart()
        LogUtil.d("MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        LogUtil.d("MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtil.d("MainActivity onPause")
    }
    override fun onStop(){
        super.onStop()
        LogUtil.d("MainActivity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        LogUtil.d("MainActivity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.d("MainActivity onDestroy")
    }
}
