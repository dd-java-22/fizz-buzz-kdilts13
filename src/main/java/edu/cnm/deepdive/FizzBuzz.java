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

  public static void main(String[] args) {
    int max = 100;
    int parsedArg;
    FizzBuzz fizzBuzz = new FizzBuzz();

    if (args.length > 0 && (parsedArg = Integer.parseInt(args[0])) > 0) {
      max = parsedArg;
    }

    for (int i = 1; i <= max; i++) {
      IO.println(fizzBuzz.fizzBuzz(i));
    }
  }

}
