package com.example.demo.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.demo.R
import com.example.demo.util.LogUtil

class SecondFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        LogUtil.d("SecondFragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtil.d("SecondFragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        LogUtil.d("SecondFragment onCreateView")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LogUtil.d("SecondFragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        LogUtil.d("SecondFragment onStart")
    }

    override fun onResume() {
        super.onResume()
        LogUtil.d("SecondFragment onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtil.d("SecondFragment onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtil.d("SecondFragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        LogUtil.d("SecondFragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.d("SecondFragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        LogUtil.d("SecondFragment onDetach")
    }
}
