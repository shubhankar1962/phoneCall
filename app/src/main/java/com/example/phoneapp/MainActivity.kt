package com.example.phoneapp

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    companion object{
        
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialbtn = findViewById<Button>(R.id.dialBtn)

        dialbtn.setOnClickListener{
           val intent  = Intent(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:7742756712"))

            if(ActivityCompat.checkSelfPermission(this, Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION) == PackageManager.PERMISSION_GRANTED)
            {
                makePhoneCall()
            }
            else{
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION),PHONE_CALL_REQUEST_CODE)
            }

        }

    }

    private fun makePhoneCall() {
        TODO("Not yet implemented")
    }
}