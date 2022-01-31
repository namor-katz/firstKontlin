import com.katzendorn.okb.first.Wrestler
import org.junit.Test
import kotlin.test.assertEquals

class FirstTest {
    @Test
    fun ff(){
        assertEquals(2 , 4/2)
    }

    @Test
    fun aikiVsSumo(){
        val sumo = Wrestler.Sumo(name = "Иясу", weight = 175);
        val aikido = Wrestler.Aikido(belt = "gray")
        assertEquals(aikido.attack(sumo), -1)
    }
}