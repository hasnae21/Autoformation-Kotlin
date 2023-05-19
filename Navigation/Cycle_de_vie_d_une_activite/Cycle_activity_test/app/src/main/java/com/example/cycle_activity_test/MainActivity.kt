package com.example.cycle_activity_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate Called")
    }

//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate()
//            Log.d(TAG, "onCreate Called")
//        }

        override fun onStart() {
            super.onStart()
            Log.d(TAG, "onStart Called")
        }


        override fun onResume() {
            super.onResume()
            Log.d(TAG, "onResume Called")
        }

        override fun onPause() {
            super.onPause()
            Log.d(TAG, "onPause Called")
        }

        override fun onStop() {
            super.onStop()
            Log.d(TAG, "onStop Called")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG, "onDestroy Called")
        }

        override fun onRestart() {
            super.onRestart()
            Log.d(TAG, "onRestart Called")
        }


}

