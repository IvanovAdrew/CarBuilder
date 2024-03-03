package com.example.carbuilder

class Car {
    var engine: String
    var wheels: Int
    var color: String
    var airbags: Boolean
    var navigation: Boolean
    var sunroof: Boolean

    // Основний конструктор
    constructor(engine: String, wheels: Int, color: String, airbags: Boolean) {
        this.engine = engine
        this.wheels = wheels
        this.color = color
        this.airbags = airbags
        this.navigation = false // Стандартне значення
        this.sunroof = false // Стандартне значення
    }

    // Конструктор з сонячним дахом
    constructor(engine: String, wheels: Int, color: String, airbags: Boolean, sunroof: Boolean) : this(engine, wheels, color, airbags) {
        this.sunroof = sunroof
    }

    // Повний конструктор
    constructor(engine: String, wheels: Int, color: String, airbags: Boolean, navigation: Boolean, sunroof: Boolean) : this(engine, wheels, color, airbags) {
        this.navigation = navigation
        this.sunroof = sunroof
    }
}
