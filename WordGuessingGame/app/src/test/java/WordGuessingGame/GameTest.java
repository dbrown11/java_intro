package WordGuessingGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameTest {
    
    @Test
    public void testGetWordsToGuess() {
        Game game = new Game(new WordChoser());
        boolean contains = Arrays.stream(new String[] { "M_____", "C______", "D________", "L_____" })
                .anyMatch(game.getWordToGuess()::equals);
        //["M_____", "C______", "D________", "L_____"].contain(game.getWordToGuess());
        assertTrue("should return M_____", contains );
    }

    @Test
    public void testGetWordsToGuessMock() {
        WordChoser mockedList = mock(WordChoser.class);
        when(mockedList.getRandomWordFromDictionery()).thenReturn("first");
        String word = mockedList.getRandomWordFromDictionery();
        assertEquals("the two things should match", String.valueOf("first"),  word );
    }

    @Test
    public void testGetRemainingAttempts() {
    Game game = new Game(new WordChoser());
    assertEquals("should return 10", Integer.valueOf(10),game.getRemainingAttempts());
    }

    @Test
    public void testTakeGuess() {
        Game game = new Game(new WordChoser());
        game.TakeGuess(); 
        game.TakeGuess();
        assertEquals("should return 8", Integer.valueOf(8), game.getRemainingAttempts());
    }

    @Test
    public void testGetsWordToGuessWithRandomWord() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionery()).thenReturn("DEVELOPER");
        assertEquals(mockedChoser.getRandomWordFromDictionery(), "DEVELOPER");
    }
    
}