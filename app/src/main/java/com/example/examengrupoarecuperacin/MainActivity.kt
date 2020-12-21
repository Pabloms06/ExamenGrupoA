package com.example.examengrupoarecuperacin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random as Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //BORRAR CONTENIDO AL PULSAR
        botonlimpiar.setOnClickListener{
            val texto = textView.text.toString()
            texto?.let{
                textView.text = it.replace(texto," ")
            }

        }
        val texto2 = textView.text.toString()
        //AÑADIR NUMERO
        botonañadir.setOnClickListener{
            textView.text = "${texto2}${Random.nextInt((9999 - 999)) + 999 }"
            botonsiguiente.isEnabled = it.isClickable
        }


        botonsiguiente.setOnClickListener{

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        fun Random( length: Int ){

            val sb = StringBuilder(length)

            val alphabet = "9999"

            val rand = Random
            for ( i in 0 until sb.capacity() ) {

                val index = rand.nextInt( alphabet.length )
                sb.append( alphabet[ index ] )
            }

        }
    }
}


