package com.tugeojson.viewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "¡App GeoJSON Viewer Funcionando!"
            textSize = 20f
            setPadding(50, 50, 50, 50)
        }
        
        val button = Button(this).apply {
            text = "Cargar GeoJSON"
            setOnClickListener {
                textView.text = "Botón funcionando - Próximo: selector de archivos"
            }
        }
        
        setContentView(android.widget.LinearLayout(this).apply {
            orientation = android.widget.LinearLayout.VERTICAL
            addView(textView)
            addView(button)
        })
    }
}
