package edu.cnm.deepdive;

import java.util.EnumSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    int max = 100;
    int parsedArg;
    Set<FizzBuzz> result;

    if (args.length > 0 && (parsedArg = Integer.parseInt(args[0])) > 0) {
      max = parsedArg;
    }

    for (int i = 1; i <= max; i++) {
      result = FizzBuzz.fizzBuzz(i);

      if (result.contains(FizzBuzz.FIZZ)) {
        IO.print(FizzBuzz.FIZZ);
      }

      if (result.contains(FizzBuzz.BUZZ)) {
        IO.print(FizzBuzz.BUZZ);
      }

      if (result.isEmpty()) {
        IO.print(i);
      }

      IO.println();
    }
  }
}
