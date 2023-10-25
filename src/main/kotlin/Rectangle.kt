class Rectangle(color: Color, var height: Double, var width: Double) : Shape(color) {
    override fun getPerimeter(): Double {
        return (height + width) * 2
    }

    override fun getArea(): Double {
        return height * width
    }
}