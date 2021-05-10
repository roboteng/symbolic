import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OperatorTest {
    @Test
    fun `two operators with the same string should be equal`(){
        assertEquals(Operator.plus(), Operator.plus())
    }
}