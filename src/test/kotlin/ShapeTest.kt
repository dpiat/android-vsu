import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShapeTest {

    @Test
    fun testSumOfAreas() {
        val rect1: Shape = Rectangle(Color.BLUE,1.0, 1.0)
        val rect2: Shape = Rectangle(Color.BLUE,1.0, 2.0)
        val tr1: Shape = Triangle(Color.BLUE,3.0, 4.0, 5.0) // прямоугольный треугольник с площадью 6.0

        val shapes = listOf(rect1, rect2, tr1)
        val totalArea = ShapeUtils.sumOfAreas(shapes)

        // Площадь rect1 = 1.0 * 1.0 = 1.0
        // Площадь rect2 = 1.0 * 2.0 = 2.0
        // Площадь tr1 = 6.0
        // Сумма = 1.0 + 2.0 + 6.0 = 9.0
        assertEquals(9.0, totalArea, 0.0001, "Сумма площадей должна быть равна 9.0")
    }
}