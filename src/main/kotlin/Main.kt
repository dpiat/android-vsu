fun main() {
    val rect1: Rectangle = Rectangle(Color.BLUE, 1.0, 1.0)
    val rect2: Rectangle = Rectangle(Color.GREEN, 1.0, 2.0)
    val tr1: Triangle = Triangle(Color.RED, 1.0, 1.0, 1.0)

    val shapes = listOf(rect1, rect2, tr1)

    val sumAreas = ShapeUtils.sumOfAreas(shapes)

    println("sumAreas $sumAreas")
}