package com.example.greetingapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // TextView
        val textView = findViewById<TextView>(R.id.textView)

        // Buttons
        val btnEnglish = findViewById<Button>(R.id.)
        val btnZulu = findViewById<Button>(R.id.btnZulu)
        val btnAfrikaans = findViewById<Button>(R.id.btnAfrikaans)
        val btnFrench = findViewById<Button>(R.id.btnFrench)
        val btnSpanish = findViewById<Button>(R.id.btnSpanish)
        val btnGerman = findViewById<Button>(R.id.btnGerman)
        val btnChinese = findViewById<Button>(R.id.btnChinese)
        val btnArabic = findViewById<Button>(R.id.btnArabic)

        // Click Listeners
        btnEnglish.setOnClickListener {
            textView.text = "Hello"
        }

        btnZulu.setOnClickListener {
            textView.text = "Sawubona"
        }

        btnAfrikaans.setOnClickListener {
            textView.text = "Hallo"
        }

        btnFrench.setOnClickListener {
            textView.text = "Bonjour"
        }

        btnSpanish.setOnClickListener {
            textView.text = "Hola"
        }

        btnGerman.setOnClickListener {
            textView.text = "Hallo"
        }

        btnChinese.setOnClickListener {
            textView.text = "Ni Hao"
        }

        btnArabic.setOnClickListener {
            textView.text = "Marhaba"
        }

        }
    }
