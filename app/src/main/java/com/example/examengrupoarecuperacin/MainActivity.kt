package com.example.examengrupoarecuperacin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_2.*
import kotlin.random.Random
import kotlin.random.nextInt

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

        //AÑADIR NUMERO
        botonañadir.setOnClickListener{

            val texto2 = textView.text.toString()
            val numeroaleatorio = Random(Random.nextInt(999..9999))
            textView.text = "${texto2}+${numeroaleatorio.nextInt()}"
            botonsiguiente.isEnabled = it.isClickable
        }


        botonsiguiente.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


    fun Random.nextInt(range: IntRange): Int {
        return range.start + nextInt(range.last - range.start)
    }


}
        }


