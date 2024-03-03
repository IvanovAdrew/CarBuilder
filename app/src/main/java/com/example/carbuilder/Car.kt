class Car private constructor(
    val engine: String,
    val wheels: Int,
    val color: String,
    val airbags: Boolean,
    val navigation: Boolean,
    val sunroof: Boolean
) {
    class Builder {
        private var engine: String = "V6"
        private var wheels: Int = 4
        private var color: String = "White"
        private var airbags: Boolean = false
        private var navigation: Boolean = false
        private var sunroof: Boolean = false

        fun engine(engine: String) = apply { this.engine = engine }
        fun wheels(wheels: Int) = apply { this.wheels = wheels }
        fun color(color: String) = apply { this.color = color }
        fun airbags(airbags: Boolean) = apply { this.airbags = airbags }
        fun navigation(navigation: Boolean) = apply { this.navigation = navigation }
        fun sunroof(sunroof: Boolean) = apply { this.sunroof = sunroof }
        fun build() = Car(engine, wheels, color, airbags, navigation, sunroof)
    }
}

