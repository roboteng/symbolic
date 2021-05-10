import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SymbolTest {
    @Test
    fun `toString should result in the symbol`() {
        val x = Symbol("x")
        assertEquals("$x", "x")
    }

    @Test
    fun `value assigned to 3 should be equal to 3`() {
        val x = Symbol("x")
        x.value = 3
        assertEquals(x.value, 3)
    }

    @Test
    fun `symbol with no value should not be constant`() {
        val x = Symbol.x()
        assertEquals(x.isVariable, true)
    }

    @Test
    fun `symbol with a value should be constant`() {
        val x = Symbol.x()
        x.value = 0
        assertEquals(x.isVariable, false)
    }

    @Test
    fun `two symbols of the same name should be equal`(){
        val x1 = Symbol.x()
        val x2 = Symbol.x()
        assertEquals(x1, x2)
    }
}