import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class IngredientTypeTest {

    private IngredientType i;

    @Test
    public void testIngredientTypeNotNullValues() {
        for (IngredientType t : IngredientType.values()) {
            assertNotNull(t);
        }
    }

    @Test
    public void testIngredientTypeValuesOf() {
        for (IngredientType t : IngredientType.values()) {
            assertEquals(t, IngredientType.valueOf(t.name()));
        }
    }
}
