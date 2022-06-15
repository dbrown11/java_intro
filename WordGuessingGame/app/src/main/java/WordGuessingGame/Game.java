package WordGuessingGame;


public class Game {
  
  String word; 
  Integer attempts = 10;
  StringBuilder wordString = new StringBuilder();

  Game(WordChoser choser ) {
    this.word = choser.getRandomWordFromDictionery();
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

  public Integer TakeGuess() {
    attempts = attempts - 1;
    return attempts;
  }
  
}