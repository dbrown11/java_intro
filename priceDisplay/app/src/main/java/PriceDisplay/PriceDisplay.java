package PriceDisplay;

public class PriceDisplay {
    public static void main(String[] args) {
      String item = "Ketle";
      Double price = 15.99;
      System.out.printf("The price of the %s is: %f", item, price);
    }

    public Object show(String item, double price) {
      String output = String.format("The price of the %s is: %f", item, price);
      return output;
    }
}
