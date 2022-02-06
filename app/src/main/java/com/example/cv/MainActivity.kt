package com.example.cv

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var nametext : EditText? = null
    private var agetext : EditText? = null
    private var emailtext : EditText? = null
    private var androidskill : SeekBar? = null
    private var iosskill : SeekBar? = null
    private var flutterskill : SeekBar? = null
    private var next : Button? = null
    private var reset : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nametext = findViewById(R.id.nametext)
        agetext = findViewById(R.id.agetext)
        emailtext = findViewById(R.id.emailtext)
        androidskill = findViewById(R.id.androidbar)
        iosskill = findViewById(R.id.iosbar)
        flutterskill = findViewById(R.id.flutterbar)
        next = findViewById(R.id.nextbtn)
        reset = findViewById( R.id.resetbtn)
        next!!.setOnClickListener{
            if (nametext!!.text.isEmpty() || agetext!!.text.isEmpty() || emailtext!!.text.isEmpty()){
                Toast.makeText(applicationContext,"3amer aaad", Toast.LENGTH_SHORT ).show()
            }
            else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(emailtext!!.text.toString()).matches()){
                Toast.makeText(applicationContext,"thabet fil mail ", Toast.LENGTH_SHORT ).show()
            }
            else if(androidskill!!.getProgress()<=30 && iosskill!!.getProgress()<=30 && flutterskill!!.getProgress()<=30){
                Toast.makeText(applicationContext,"e5dem e5dem", Toast.LENGTH_SHORT ).show()

            }
            else if(androidskill!!.getProgress()>80 && iosskill!!.getProgress()>80 && flutterskill!!.getProgress()>80){
                Toast.makeText(applicationContext,"mmmmmmmm", Toast.LENGTH_SHORT ).show()
            }
            else if(androidskill!!.getProgress()>80 || iosskill!!.getProgress()>80 || flutterskill!!.getProgress()>80){
                Toast.makeText(applicationContext,"fla7t fi wahda sahiit", Toast.LENGTH_SHORT ).show()
            }
            else{
                Toast.makeText(applicationContext,"3aaady", Toast.LENGTH_SHORT ).show()
            }
            reset!!.setOnClickListener{
                nametext!!.text.clear()
                agetext!!.text.clear()
                emailtext!!.text.clear()
                androidskill!!.setProgress(0)
                iosskill!!.setProgress(0)
                flutterskill!!.setProgress(0)

            }
        }

    }

}