public class LeapYear{
    
  public String leapyearlist(Integer year) {
    
    for (Integer i = 1 ; i < year ; i++) {
      if (i % 400 == 0) {
        System.out.println(i.toString() + " LEAP YEAR");
      } else if (i % 100 == 0 && i % 400  != 0 ) {
        System.out.println(i.toString());
      } else if (i % 4 == 0 && i % 100 != 0) {
        System.out.println(i.toString() + " LEAP YEAR");
      } else if (i % 4 == 0) {
        System.out.println(i.toString());
      } else {
        System.out.println(i.toString());
      }
    }
    return "yes";
  }

  public static void main(String[] args) {
    LeapYear test = new LeapYear();
    String result = test.leapyearlist(1999);
    System.out.println(result);
  }

}


