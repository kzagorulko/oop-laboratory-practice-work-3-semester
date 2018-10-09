package zag.lab2

class CircleTest extends GroovyTestCase {
    Circle standartCircle = new Circle(2)
    Circle colorCircle = new Circle(3, "pink")
    Circle positionCircle = new Circle(2.3, 1, 2,"Green")

    void setUp() {

        super.setUp()
    }

    void tearDown() {
    }

    void testGetRadius() {
        double expected = 2
        double actual = standartCircle.getRadius()
        assertEquals(expected, actual)
    }

    void testGetX() {
        double expected = 1
        double actual = positionCircle.getX()
        assertEquals(expected, actual)
    }

    void testGetY() {
        double expected = 2
        double actual = positionCircle.getY()
        assertEquals(expected, actual)
    }

    void testGetColor() {
        String expected = "pink"
        String actual = colorCircle.getColor()
        assertEquals(expected, actual)
    }

    void testSetRadius() {
        double expected = 8.3
        standartCircle.setRadius(expected)
        double actual = standartCircle.getRadius()
        assertEquals(expected, actual)
    }

    void testSetX() {
        double expected = 14.228
        positionCircle.setX(expected)
        double actual = positionCircle.getX()
        assertEquals(expected, actual)
    }

    void testSetY() {
        double expected = 17.3
        positionCircle.setY(expected)
        double actual = positionCircle.getY()
        assertEquals(expected, actual)
    }

    void testSetColor() {
        String expected = "White"
        colorCircle.setColor(expected)
        String actual = colorCircle.getColor()
        assertEquals(expected, actual)
    }
}
