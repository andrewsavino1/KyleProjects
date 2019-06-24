package FindBiggestElement;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class FindBiggestElementTest {

    int NUM_REPITIIONS = 20;

    @Test
    public void FindsTheRightNumber(){

        Random myRandomGenerator = new Random();

        for(int i = 0; i< NUM_REPITIIONS; i++){
            int[] myIntegerArray = myRandomGenerator.ints(100).toArray();
            int myRealAnswer = Arrays.stream(myIntegerArray).max().orElse(Integer.MAX_VALUE);
            Assert.assertEquals(myRealAnswer, FindBiggestElement.findBiggest(myIntegerArray));
        }
    }
}
