package com.example.demo.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.demo.R
import com.example.demo.util.LogUtil

class FirstFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        LogUtil.d("FirstFragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtil.d("FirstFragment onCreate")
    }
    //这里是 Fragment 自身创建阶段，通常用来做一些非界面初始化。

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        LogUtil.d("FirstFragment onCreateView")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
    //界面创建方法

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LogUtil.d("FirstFragment onViewCreated")
    }
    //这一步表示“View 已经创建好了

    override fun onStart() {
        super.onStart()
        LogUtil.d("FirstFragment onStart")
    }

    override fun onResume() {
        super.onResume()
        LogUtil.d("FirstFragment onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtil.d("FirstFragment onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtil.d("FirstFragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        LogUtil.d("FirstFragment onDestroyView")
        //表示 Fragment 的“界面 View 被销毁了”，但 Fragment 对象本身可能还活着。
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.d("FirstFragment onDestroy")
        //  表示 Fragment 对象本身也要销毁了。
    }

    override fun onDetach() {   //表示Fragment和宿主Activity彻底解绑，不再挂在SecondActivity上
        super.onDetach()
        LogUtil.d("FirstFragment onDetach")
    }
}
