package com.example.cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        codigo()
    }


    /***  var : Variables Mutables ***/
    /***  val: Variables Inmutables - Constantes ***/

    /***  Byte ***/
    /*** Short ***/
    /*** Int  ***/
    /*** Long ***/
    /***  ***/
    /***  ***/
    /*** Float ***/
    /*** Double ***/
    /***  ***/
    /***  ***/
    /*** Char ***/
    /*** Boolean ***/
    /*** String ***/

    fun codigo(){
        var nombre:String= "Rafa"
        var a=3
        var b =1
        var c =8

        var suma=a+b+c
        println("$nombre, El resultado es $suma")

    }
}