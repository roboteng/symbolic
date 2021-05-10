import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ExpressionTest {
    @Test
    fun `creating an expression from two Symbols`() {
        val x = Symbol("x")
        val y = Symbol("y")
        val e = x + y
        assertEquals(e, x + y)
    }

    @Test
    fun `different expressions should not be equals`() {
        val x = Symbol.x()
        val y = Symbol.y()
        val z = Symbol.z()
        assertNotEquals(x + y, x + z)
    }

    @Test
    fun `different expressions should not be equals 2`() {
        val x = Symbol.x()
        val y = Symbol.y()
        val z = Symbol.z()
        assertNotEquals(x + z, y + z)
    }

    @Test
    fun `expressions should not be the same, if operator is not equal`() {
        val x = Symbol.x()
        val y = Symbol.y()
        assertNotEquals(x + y, x - y)
    }

    @Test
    fun `toString should use all values`() {
        val x = Symbol.x()
        val y = Symbol.y()
        assertEquals((x + y).toString(), "x + y")
    }

    @Test
    fun `Expression plus Symbol should result in an Expression`() {
        val x = Symbol.x()
        val e = x + x
        val e2 = e + x
        val e3 = x + e
    }

    @Test
    fun `expressions should be able to be added to constants`(){
        val x = Symbol.x()
        val e = x + 3
        val e2 = 3 + x
    }

    @Test
    fun `expressions should be able to be multiplied by constants`(){
        val x = Symbol.x()
        val e = x * 3
        val e2 = 3 * x
    }

    @Test
    fun `expressions should be able to be subtracted from constants`(){
        val x = Symbol.x()
        val e = x - 3
        val e2 = 3 - x
    }

    @Test
    fun `expressions should be able to be divided by constants`(){
        val x = Symbol.x()
        val e = x / 3
        val e2 = 3 / x
    }

}





