package lab3.zagorulko

/**
 * Created by liveuser on 18.10.18.
 */
class PoodleTest extends GroovyTestCase {
    Poodle george = new Poodle("George", 4, 65, 40, true)

    void testSetBald() {
        boolean actual   = george.isBald()
        boolean expected = true
        assertEquals(actual, expected)
    }

    void testIsBald() {
        boolean expected = false
        george.setBald(expected)
        boolean actual   = george.isBald()
        assertEquals(actual, expected)
    }

    void testGetNickname() {
        String actual   = george.getNickname()
        String expected = "George"
        assertEquals(actual, expected)
    }

    void testSetNickname() {
        String expected = "Filip"
        george.setNickname(expected)
        String actual   = george.getNickname()
        assertEquals(actual, expected)
    }

    void testGetNumberOfLegs() {
        int actual   = george.getNumberOfLegs()
        int expected = 4
        assertEquals(actual, expected)
    }

    void testSetNumberOfLegs() {
        int expected = 3
        george.setNumberOfLegs(expected)
        int actual   = george.getNumberOfLegs()
        assertEquals(actual, expected)
    }

    void testGetLength() {
        int actual   = george.getLength()
        int expected = 65
        assertEquals(actual, expected)
    }

    void testSetLength() {
        int expected = 131
        george.setLength(expected)
        int actual   = george.getLength()
        assertEquals(actual, expected)
    }

    void testGetGrowth() {
        int actual   = george.getGrowth()
        int expected = 40
        assertEquals(actual, expected)
    }

    void testSetGrowth() {
        int expected = 72
        george.setGrowth(expected)
        int actual   = george.getGrowth()
        assertEquals(actual, expected)
    }
}
