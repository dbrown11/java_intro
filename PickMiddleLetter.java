import java.util.Scanner;

public class PickMiddleLetter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give us a word and we will give you the middle letter(s)");
        String userInput = myScanner.nextLine();
        String[] inputArr = userInput.split("");
        System.out.println(inputArr[0]);

        Integer wordLength = userInput.length();

        if ( wordLength % 2 == 0 ) {
            Integer lettersIn = (wordLength / 2) - 1;
            System.out.println(inputArr[lettersIn] + inputArr[lettersIn + 1]);
        } else {
            Integer lettersInn = ((wordLength - 1) / 2);
            System.out.println(lettersInn);
            System.out.println(inputArr[lettersInn]);
        }
    }
}
