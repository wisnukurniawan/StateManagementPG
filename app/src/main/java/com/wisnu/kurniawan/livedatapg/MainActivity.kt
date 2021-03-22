package com.wisnu.kurniawan.livedatapg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.viewModels
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.effect.observe(
            this,
            Observer {
                Log.d("wsndkr", "effect $it")
            }
        )

        mainViewModel.state.observe(
            this,
            Observer {
                Log.d("wsndkr", "state $it")
            }
        )

        findViewById<Button>(R.id.btn_1).setOnClickListener {
            mainViewModel.updateEffect1()
            mainViewModel.updateState1()
        }

        findViewById<Button>(R.id.btn_2).setOnClickListener {
            mainViewModel.updateEffect2()
            mainViewModel.updateState2()
            startActivity(Intent(this, SecondActivity::class.java))
        }

        findViewById<Button>(R.id.btn_3).setOnClickListener {
            mainViewModel.updateState3()
        }
    }
}
