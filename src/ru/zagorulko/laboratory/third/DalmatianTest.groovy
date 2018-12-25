package ru.zagorulko.laboratory.third

/**
 * Created by liveuser on 18.10.18.
 */
class DalmatianTest extends GroovyTestCase {
    Dalmatian george = new Dalmatian("George", 4, 120, 70, 201)

    void testGetNumberOfStained() {
        int actual   = george.getNumberOfStained()
        int expected = 201
        assertEquals(actual, expected)
    }

    void testSetNumberOfStained() {
        int expected = 301
        george.setNumberOfStained(expected)
        int actual   = george.getNumberOfStained()
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
        int expected = 120
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
        int expected = 70
        assertEquals(actual, expected)
    }

    void testSetGrowth() {
        int expected = 72
        george.setGrowth(expected)
        int actual   = george.getGrowth()
        assertEquals(actual, expected)
    }
}
