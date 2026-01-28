package edu.cnm.deepdive;

public class Main {

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
