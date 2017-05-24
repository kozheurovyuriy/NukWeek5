package task13;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

import static org.junit.Assert.*;

public class NegativePositiveDigitsSorterTest {

    private List<Integer> list;
    private NegativePositiveDigitsSorter sorter;

    @Before
    public void setUp(){
        list = Arrays.asList(4,2,-1,5,67,-2,-4,6);
        sorter = new NegativePositiveDigitsSorter();
    }

    @Test
    public void orderNegativePositiveDigits() throws Exception {
        List<Integer> etalon = Arrays.asList(-4,-2,-1,4,2,5,67,6);
        List<Integer> result = sorter.orderNegativePositiveDigits(list);
        for(int i = 0; i < etalon.size(); i++) {
            assertEquals(result.get(i), etalon.get(i));
            //System.out.println("" + result.get(i) + " " + etalon.get(i));
        }
    }

}