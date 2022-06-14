package calculator;


public class calculator {

  public static void main(String[] args) {
    Integer result = 2 + 2;
    System.out.printf("2 + 2 should equal %d\n", result);
  }

  public Integer minus(Integer a, Integer b) {
    return a - b;
  }

  public Integer add(Integer a, Integer b) {
    return a + b;
  }
}
