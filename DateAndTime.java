import java.time.LocalDateTime; //import local date and time
import java.time.format.DateTimeFormatter; //Import the DateTimeFormater class 


public class DateAndTime {

  public static final String TEXT_RED = "\u001B[31m";
  public static final String TEXT_RESET = "\u001B[0m";
  public static void main(String[] args) {

    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
    String formattedDate = myDateObj.format(myFormatObj);

    System.out.printf("The current" + TEXT_RED + " time " + TEXT_RESET + "is " + formattedDate + "\n");
  }
}
