import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EquivalenceTest {
    private val x = Symbol.x()
    private val y = Symbol.y()
    private val simplifier = Simplifier()

    @Test
    fun `x + y should be equivalent to itself`() {
        val e1 = x + y
        val e2 = x + y

        val areEquivalent = simplifier.areEquivalent(e1, e2)

        assertEquals(areEquivalent, true)
    }

    @Test
    fun ` x + x should not be equivalent to x + y`() {
        val e1 = x + y
        val e2 = x + x

        val areEquivalent = simplifier.areEquivalent(e1, e2)

        assertEquals(areEquivalent, false)
    }

    @Test
    fun ` y + x should be equivalent to y + x`() {
        val e1 = y + x
        val e2 = y + x

        val areEquivalent = simplifier.areEquivalent(e1, e2)

        assertEquals(areEquivalent, true)
    }
}