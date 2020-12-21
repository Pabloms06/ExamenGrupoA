package com.example.examengrupoarecuperacin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_2.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        editTextTextPersonName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {

                s?.let {
                    button.isEnabled = it.isNotEmpty()

                }
            }
        })
        
        val guardado = editTextTextPersonName.text.toString()

editTextTextPersonName.addTextChangedListener(object : TextWatcher {
     override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

     }


     override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
     }

     override fun afterTextChanged(s: Editable?) {
         editTextTextPersonName.let {
             if (it = guardado) {
             val show = Toast.makeText(this, "Cambia el texto primero", Toast.LENGTH_SHORT).show()
         } else {
             Toast.makeText(this, "Cambiado", Toast.LENGTH_SHORT) //no lo muestra
         } }

     }
 })
}

}

