package TDDLab1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class CustomListTest {

    @Test
    public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
        List<Object> list = new CustomList<>();

        assertTrue(list.isEmpty());
    }

    @Test
    public void givenNonEmptyList_whenIsEmpty_thenFalseIsreturned() {
        List<Object> list = new CustomList<>();
        list.add(null);

        assertFalse(list.isEmpty());
    }
}