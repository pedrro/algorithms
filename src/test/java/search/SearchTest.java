package search;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchTest {
    private Search ls;
    private String[] array;

    @Before
    public void setUp() throws Exception {
        ls = new Search();
        array = new String[]{"a", "b", "c"};
    }

    @Test
    public void shouldFindAnItemOnArray() throws Exception {
        assertEquals("b", ls.linearSearch(array, "b"));
    }

    @Test
    public void shouldReturnNOTFOUNDWhenNotFindAnItem() throws Exception {
        assertNotFound(ls.linearSearch(array, "g"));
    }

    @Test
    public void shouldReturnAnItemFoundBySentinelSearch() throws Exception {
        assertEquals("b", ls.sentinelLinearSearch(array, 3, "b"));
    }

    @Test
    public void shouldNotFindAnItemBySentinelSearch() throws Exception {
        assertNotFound(ls.sentinelLinearSearch(array,3, "g"));
    }

    private void assertNotFound(String expectedItem) {
        assertEquals("NOT FOUND", expectedItem);
    }
}