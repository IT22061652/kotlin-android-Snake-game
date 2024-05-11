package com.example.snakegame

import androidx.lifecycle.ViewModel

class MyViewmodel:ViewModel() {

    private var startingtext=""



    fun getstartingtext():String{
        return "Start Game"
    }
}