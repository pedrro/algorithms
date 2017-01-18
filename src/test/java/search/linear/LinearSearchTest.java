package search.linear;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {
    LinearSearch ls;

    @Before
    public void setUp() throws Exception {
        ls = new LinearSearch();

    }

    @Test
    public void shouldFindAnItemOnArray() throws Exception {
        String[] array = new String[]{"a", "b", "c"};
        assertEquals("b", ls.linearSearch(array, "b"));
    }

    @Test
    public void shouldReturnNOTFOUNDWhenNotFindAnItem() throws Exception {
        String[] array = new String[]{"a", "b", "c"};
        assertEquals("NOT FOUND", ls.linearSearch(array, "g"));
    }
}