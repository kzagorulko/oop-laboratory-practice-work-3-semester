package ru.zagorulko.laboratory.third

/**
 * Created by liveuser on 18.10.18.
 */
class TablewareTest extends GroovyTestCase {

    Tableware fork = new Tableware("Fork", "aluminium", Tableware.TablewareTyp.FORK)
    void testGetTyp() {
        Tableware.TablewareTyp actual   = fork.getTyp()
        Tableware.TablewareTyp expected = Tableware.TablewareTyp.FORK
        assertEquals(actual, expected)
    }

    void testSetTyp() {
        Tableware.TablewareTyp expected = Tableware.TablewareTyp.KNIFE
        fork.setTyp(expected)
        Tableware.TablewareTyp actual   = fork.getTyp()
        assertEquals(actual, expected)
    }

    void testGetName() {
        String actual   = fork.getName()
        String expected = "Fork"
        assertEquals(actual, expected)
    }

    void testSetName() {
        String expected = "Knife"
        fork.setName(expected)
        String actual   = fork.getName()
        assertEquals(actual, expected)
    }

    void testGetMaterial() {
        String actual   = fork.getMaterial()
        String expected = "aluminium"
        assertEquals(actual, expected)
    }

    void testSetMaterial() {
        String expected = "plastic"
        fork.setMaterial(expected)
        String actual   = fork.getMaterial()
        assertEquals(actual, expected)
    }
}
