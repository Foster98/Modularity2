package sorters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSorterTest {
    @Test
    void sort() {
        var exampleList = Arrays.asList(4, 3, 2, 1);
        var actual = new SelectionSorter().sort(exampleList);

        var expected = Arrays.asList(1, 2, 3, 4);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

}