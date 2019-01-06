package com.example.gaurav.thankyoutickanimation

import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val drawable = iv_thank_you.drawable
        startThankYouAnim(drawable)
        bt_thank_you.setOnClickListener(View.OnClickListener {
            startThankYouAnim(drawable)
        })
    }

    fun startThankYouAnim(drawable: Drawable) {
        Handler().postDelayed(Runnable {
            if (drawable is Animatable) {
                iv_thank_you.visibility = View.VISIBLE
                (drawable as Animatable).stop()
                (drawable as Animatable).start()
            }
        }, 500)
    }
}
