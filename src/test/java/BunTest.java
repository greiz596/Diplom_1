import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.*;

public class BunTest {
    private String name = "testName";
    private float price = 3.1f;
    private Bun bun;

    @Before
    public void setUp(){
        bun = new Bun(name, price);
    }
    @Test
    public void testConstructor(){
        assertEquals(name, bun.getName());
        assertEquals(price, bun.getPrice(), 0);
    }

    @Test
    public void testGetName() {
        assertEquals(name, bun.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(price, bun.getPrice(), 0);
    }
}