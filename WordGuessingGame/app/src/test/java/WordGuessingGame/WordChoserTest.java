package WordGuessingGame;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class WordChoserTest {

    @Test
    public void testGetRandomWord() {
        WordChoser randWord = new WordChoser();
        boolean contains = Arrays.stream(new String[] { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" })
                .anyMatch(randWord.getRandomWordFromDictionery()::equals);
        assertTrue("should pass is word retuerns is in the dictionaery ", contains );
    }

    
}
