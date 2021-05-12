import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SimplifyTest {
    lateinit var simplifier: Simplifier

    @BeforeEach
    fun setUp() {
        simplifier = Simplifier()
    }

    @Test
    fun `addition should be commutative`() {
        val x = Symbol.x()
        val y = Symbol.y()
        val z = Symbol("z")
        val e1 = (x + y) + z
        assertEquals(e1, simplifier.simplify(e1))
    }

    @Test
    fun `addition should be commutative 2`() {
        val x = Symbol.x()
        val y = Symbol.y()
        val z = Symbol("z")
        val e1 = (x + y) + z
        val e2 = x + (y + z)
        assertEquals(e1, simplifier.simplify(e2))
    }

    @Test
    fun `variable added to itself, should equal itself`() {
        val x = Symbol.x()
        val e = x + x
        assertEquals(2 * x, simplifier.simplify(e))
    }

    @Test
    fun `variable added to different variable, should not change`() {
        val x = Symbol.x()
        val y = Symbol.y()
        val e = x + y
        assertEquals(x + y, simplifier.simplify(e))
    }
}