import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import static org.junit.Assert.assertEquals;


public class HandleTruthTest {
    //@Test
    //public void makeshiftTest() {
        //HandleTruth.wordCount();
    //}

    //test 1
    @Test
    public void checkForYou(){
        //check for number of word "you"
        assertEquals(18, HandleTruth.wordCount("you"));
    }

    //test 2
    @Test
    public void checkForTruth(){
        //checked to see if it fails when expected is wrong.
        //assertEquals(0, HandleTruth.wordCount("truth"));
        assertEquals(1, HandleTruth.wordCount("truth"));
    }

    //test 3
    @Test
    public void checkThe(){
        //check for number of word "the"
        assertEquals(9, HandleTruth.wordCount("the"));
    }

    //test 4
    @Test
    public void checkThat(){
        //check for number of word "that"
        assertEquals(6, HandleTruth.wordCount("that"));
    }

    //test 5
    @Test
    public void checkAnd(){
        //check for number of word "and"
        assertEquals(8, HandleTruth.wordCount("and"));
    }
}