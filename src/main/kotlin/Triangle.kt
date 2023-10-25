import kotlin.math.sqrt

class Triangle(color: Color, var a: Double, var b: Double, var c: Double) : Shape(color) {
    override fun getPerimeter(): Double {
        return a + b + c
    }
    override fun getArea(): Double {
        val halfPerimeter: Double = this.getPerimeter() / 2
        return sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c))
    }
}