package lab3.zagorulko

class PlateTest extends GroovyTestCase {
    Plate plate = new Plate("porcelain", 12)

    void testGetRadius() {
        final String actual = plate.getRadius()
        final String expected = 12
        assertEquals(actual, expected)
    }

    void testSetRadius() {
        final int expected = 11
        plate.setRadius(expected)
        final int actual = plate.getRadius()
        assertEquals(actual, expected)
    }

    void testGetName() {
        final String expected = "Plate"
        final String actual   = plate.getName()
        assertEquals(actual, expected)
    }

    void testSetName() {
        final String expected = "Favorite plate"
        plate.setName(expected)
        final String actual   = plate.getName()
        assertEquals(actual, expected)
    }

    void testGetMaterial() {
        final String expected = "porcelain"
        final String actual   = plate.getMaterial()
        assertEquals(actual, expected)
    }

    void testSetMaterial() {
        final String expected = "ceramics"
        plate.setMaterial(expected)
        final String actual   = plate.getMaterial()
        assertEquals(actual, expected)
    }
}
