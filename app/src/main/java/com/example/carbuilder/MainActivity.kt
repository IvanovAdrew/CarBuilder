package com.example.carbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Створення екземплярів Car без використання Builder
        val car1 = Car("V8", 4, "Red", true, true, false)
        val car2 = Car("V6", 4, "Blue", false)
        val car3 = Car("V8", 4, "Black", true, false, true)

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
