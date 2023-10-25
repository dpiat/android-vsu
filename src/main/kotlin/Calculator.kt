object ShapeUtils {
    fun sumOfAreas(shapes: List<Shape>): Double {
        return shapes.sumOf { it.getArea() }
    }
}