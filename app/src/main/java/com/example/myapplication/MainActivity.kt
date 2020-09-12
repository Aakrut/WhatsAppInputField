package com.ex.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.whattsappfield.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         val text_t : EditText = findViewById(R.id.text_field)


        val fab = findViewById<FloatingActionButton>(R.id.fab_button)
       fab.setOnClickListener {
           val st = text_t.text.toString()
            if(st.isNotEmpty()){

                Toast.makeText(this@MainActivity, "Text is :  $st", Toast.LENGTH_SHORT).show()
                text_t.text.clear()
            }else{

                Toast.makeText(this@MainActivity, "Mic Clicked", Toast.LENGTH_SHORT).show()
            }

        }

        text_t.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
              fab.setImageResource(R.drawable.ic_mic)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s.isNullOrEmpty()){
                    fab.setImageResource(R.drawable.ic_mic)

                }else{
                    fab.setImageResource(R.drawable.ic_send)

                }
            }
        })
        fab.setImageResource(R.drawable.ic_mic)

        emogy.setOnClickListener {
            Toast.makeText(this@MainActivity, "emogy Clicked", Toast.LENGTH_SHORT).show()
        }

        attach.setOnClickListener {
            Toast.makeText(this@MainActivity, "Attach Clicked", Toast.LENGTH_SHORT).show()
        }

        camera.setOnClickListener {
            Toast.makeText(this@MainActivity, "Camera Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}


