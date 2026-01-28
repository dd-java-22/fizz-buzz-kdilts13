package edu.cnm.deepdive;

public class FizzBuzz {

  public String fizzBuzz(int position) {
    boolean isFizz = position % 3 == 0;
    boolean isBuzz = position % 5 == 0;

    if (position <= 0) {
      throw new IllegalArgumentException("Position must be greater than 0");
    } else if (isFizz && isBuzz) {
      return "FizzBuzz";
    } else if (isBuzz) {
      return "Buzz";
    } else if (isFizz) {
      return "Fizz";
    } else {
      return Integer.toString(position);
    }
  }

  public static void main(String[] args) {
    int max = 100;
    int parsedArg;
    FizzBuzz fizzBuzz = new FizzBuzz();

    if (args.length > 0 && (parsedArg = Integer.parseInt(args[0])) > 0) {
      max = parsedArg;
    }

    for (int i = 1; i <= max; i++) {
      System.out.println(fizzBuzz.fizzBuzz(i));
    }
  }

}
