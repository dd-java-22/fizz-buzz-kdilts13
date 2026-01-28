package edu.cnm.deepdive;

public class FizzBuzz {

  public String fizzBuzz(int position) {
    String result = "";
    boolean isFizz = position % 3 == 0;
    boolean isBuzz = position % 5 == 0;

    if (position <= 0) {
      throw new IllegalArgumentException("Position must be greater than 0");
    }

    if (isFizz) {
      result += "Fizz";
    }

    if (isBuzz) {
      result += "Buzz";
    }

    if (result.isEmpty()) {
      result = Integer.toString(position);
    }

    return result;
  }

}
