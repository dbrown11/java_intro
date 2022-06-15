package WordGuessingGame;

import java.util.Random;

public class WordChoser {

    static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
  
    public String getRandomWordFromDictionery() {
        Integer length = DICTIONARY.length;
        Random x = new Random();
        return DICTIONARY[x.nextInt(length)];
    }
    
}
