package ru.zagorulko.laboratory.second

class HumanTest extends GroovyTestCase {
    Hand hand = new Hand(8, 60)
    Head head = new Head(20, 30, "Black")
    Leg leg   = new Leg(100,30,"Greek")
    Human student = new Human(hand, head, leg, "European", 170, 20 )

    void testGetHands() {
        Hand expected = hand
        Hand actual = student.getHands()
        assertEquals(expected, actual)
    }

    void testSetHands() {
        Hand expected = new Hand(10,20)
        student.setHands(expected)
        Hand actual  = student.getHands()
        assertEquals(expected, actual)
    }

    void testGetHead() {
        Head expected = head
        Head actual = student.getHead()
        assertEquals(expected, actual)
    }

    void testSetHead() {
        Head expected = new Head(10,20, "White")
        student.setHead(expected)
        Head actual = student.getHead()
        assertEquals(expected, actual)
    }

    void testGetLegs() {
        Leg expected = leg
        Leg actual = student.getLegs()
        assertEquals(expected, actual)
    }

    void testSetLegs() {
        Leg expected = new Leg(10,20,"Rome")
        student.setLegs(expected)
        Leg actual = student.getLegs()
        assertEquals(expected, actual)
    }

    void testGetRace() {
        String expected = "European"
        String actual = student.getRace()
        assertEquals(expected, actual)
    }

    void testSetRace() {
        String expected = "Asian"
        student.setRace(expected)
        String actual = student.getRace()
        assertEquals(expected, actual)
    }

    void testGetGrowth() {
        double expected = 170
        double actual = student.getGrowth()
        assertEquals(expected, actual)
    }

    void testSetGrowth() {
        double expected = 200
        student.setGrowth(expected)
        double actual = student.getGrowth()
        assertEquals(expected, actual)
    }

    void testGetAge() {
        int expected = 20
        int actual = student.getAge()
        assertEquals(expected,actual)
    }

    void testSetAge() {
        int expected = 40
        student.setAge(expected)
        int actual = student.getAge()
        assertEquals(expected, actual)
    }
}
