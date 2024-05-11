package com.example.snakegame


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.snakegame.databinding.ActivityGamestartBinding
import com.example.snakegame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel:MyViewmodel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        myViewModel=ViewModelProvider(this).get(MyViewmodel::class.java)
        binding.play.text=myViewModel.getstartingtext().toString()

        val  bt=findViewById<Button>(R.id.play)

        bt.setOnClickListener(){

            val intent = Intent(this,Gamestart::class.java)
            startActivity(intent)
        }
    }


}