package WordGuessingGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class GameTest {
    @Test
    public void testGetWordsToGuess() {
        Game game = new Game();
        boolean contains = Arrays.stream(new String[] { "M_____", "C______", "D________", "L_____" })
                .anyMatch(game.getWordToGuess()::equals);
        //["M_____", "C______", "D________", "L_____"].contain(game.getWordToGuess());
        assertTrue("should return M_____", contains );
    }
    @Test
    public void testGetRemainingAttempts() {
    Game game = new Game();
    assertEquals("should return 10", Integer.valueOf(10),game.getRemainingAttempts());
    }
}