package com.example.carbuilder

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Створення екземплярів Car з використанням Builder
        val car1 = Car.Builder()
            .engine("V8")
            .color("Red")
            .airbags(true)
            .navigation(true)
            .build()

        val car2 = Car.Builder()
            .engine("V6")
            .color("Blue")
            .build()

        val car3 = Car.Builder()
            .engine("V8")
            .color("Black")
            .airbags(true)
            .sunroof(true)
            .build()

        // Формування інформації для відображення
        val displayText = """
            Car 1:
            Engine: ${car1.engine}
            Wheels: ${car1.wheels}
            Color: ${car1.color}
            Airbags: ${car1.airbags}
            Navigation: ${car1.navigation}
            Sunroof: ${car1.sunroof}
            
            Car 2:
            Engine: ${car2.engine}
            Wheels: ${car2.wheels}
            Color: ${car2.color}
            Airbags: ${car2.airbags}
            Navigation: ${car2.navigation}
            Sunroof: ${car2.sunroof}
            
            Car 3:
            Engine: ${car3.engine}
            Wheels: ${car3.wheels}
            Color: ${car3.color}
            Airbags: ${car3.airbags}
            Navigation: ${car3.navigation}
            Sunroof: ${car3.sunroof}
            """.trimIndent()

        // Встановлення тексту в TextView
        findViewById<TextView>(R.id.infoTextView).text = displayText
    }
}
