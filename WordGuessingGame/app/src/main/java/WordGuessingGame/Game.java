package WordGuessingGame;

import java.util.Random;

public class Game {
  
  static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
  String word; 
  Integer attempts = 10;
  StringBuilder wordString = new StringBuilder();

  Game() {
    this.word = getRandomWordFromDictionery();
  }

  public String getWordToGuess() {

      char[] wordarr = word.toCharArray();

      wordString.append(wordarr[0]);
      for (Integer i = 1; i < wordarr.length; i++) {
          wordString.append("_");
      }
      return wordString.toString();
  }
  
  public Integer getRemainingAttempts() {
      return attempts;
  }

  public String getRandomWordFromDictionery() {
    Integer length = DICTIONARY.length;
    Random x = new Random();
    return DICTIONARY[x.nextInt(length)];
  }

  
}