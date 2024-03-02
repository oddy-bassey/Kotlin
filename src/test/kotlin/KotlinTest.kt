import org.junit.Test
import java.lang.IllegalArgumentException

class Kotlintest {

    @Test
    fun `get random returns value between 0 and 100`() {
        val random = getRandom(100);
        assert(random in 0..100)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `get random throws exception when negative value is passed`() {
        assert(getRandom(-100) in 0..100)
    }
}