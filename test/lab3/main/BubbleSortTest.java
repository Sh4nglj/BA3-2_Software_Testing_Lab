package lab3.main;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * BubbleSort Tester.
 *
 * @author sh4nglj
 * @version 1.0
 * @since <pre>03/29/2022</pre>
 */
public class BubbleSortTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: BubbleSort(int[] arr)
     */
    @Test
    public void testBubbleSort1() throws Exception {
        int[] original = {1, 5, 3, 2};
        int[] target = {1, 2, 3, 5};
        assertArrayEquals(BubbleSort.BubbleSort(original), target);
    }

    @Test
    public void testBubbleSort2() throws Exception {
        int[] original = {3, 1, 6, 0};
        int[] target = {0, 1, 3, 6};
        BubbleSort b = new BubbleSort();
        assertArrayEquals(b.BubbleSort(original), target);
    }

}
