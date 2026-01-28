package edu.cnm.deepdive;

import java.util.EnumSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    int max = 100;
    int parsedArg;
    String output;

    if (args.length > 0 && (parsedArg = Integer.parseInt(args[0])) > 0) {
      max = parsedArg;
    }

    for (int i = 1; i <= max; i++) {
      output = switch (FizzBuzz.fizzBuzz(i)) {
        case Set<FizzBuzz> s when s.equals(EnumSet.allOf(FizzBuzz.class)) -> "FizzBuzz";
        case Set<FizzBuzz> s when s.contains(FizzBuzz.FIZZ) -> "Fizz";
        case Set<FizzBuzz> s when s.contains(FizzBuzz.BUZZ) -> "Buzz";
        case Set<FizzBuzz> _ -> Integer.toString(i);
      };

      IO.println(output);
    }
  }
}
