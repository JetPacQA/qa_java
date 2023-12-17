import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatClassTest {
    @Mock
    private Feline feline;

    @Test
    public void getCatSound() {
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getCatFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualCatFood = cat.getFood();
        List<String> expectedCatFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedCatFood, actualCatFood);
    }


}
