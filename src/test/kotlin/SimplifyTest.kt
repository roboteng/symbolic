import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SimplifyTest {
    lateinit var simplifier: Simplifier
    @BeforeEach
    fun setUp(){
        simplifier = Simplifier()
    }

    @Test
    fun `addition should be commutative`(){
        val x = Symbol.x()
        val y = Symbol.y()
        val z = Symbol("z")
        val e1 = (x + y) + z
        assertEquals(simplifier.simplify(e1), e1)
    }

    @Test
    fun `addition should be commutative 2`(){
        val x = Symbol.x()
        val y = Symbol.y()
        val z = Symbol("z")
        val e1 = (x + y) + z
        val e2 = x + (y + z)
        assertEquals(simplifier.simplify(e2), e1)
    }
}