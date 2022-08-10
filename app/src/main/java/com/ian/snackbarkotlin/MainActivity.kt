package com.ian.snackbarkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.snackId)
        button.setOnClickListener {
            Snackbar.make(it,"Mambo vipi",Snackbar.LENGTH_LONG)
                .setAction("click"){
                    startActivity(Intent(this@MainActivity,ProfileActivity::class.java))
                }
                .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE)
                .show()

        }
    }

}