import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle();
    }

    @Test
    public void has100Volume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void testTakeDrink() {
        waterbottle.takeDrink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void testEmpty() {
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void testFill() {
        waterbottle.empty();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}
