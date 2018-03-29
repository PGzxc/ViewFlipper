package com.pgzxc.viewflipper

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mNewsFlipperView.setData(arrayOf("小米MIX2发布","抢眼Couple装，点亮情人节"))
        mNewsFlipperView.setOnItemClickListener<String>(object : NewsFlipperView.OnItemClickListener<String> {
            override fun onItemClick( data: String) {
                toast(data)
            }

        })
    }
}
