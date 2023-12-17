import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void felineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actualFelineFood = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualFelineFood);
    }

    @Test
    public void felineGetFamily() throws Exception {
        Feline feline = new Feline();
        String actualFelineFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFelineFamily);
    }

    @Test
    public void felineGetKittens(){
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens();
        assertEquals( 1, actualKittensCount);
    }

}