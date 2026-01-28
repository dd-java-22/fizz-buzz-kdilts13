package edu.cnm.deepdive;

import java.util.EnumSet;
import java.util.Set;

public enum FizzBuzz {
  FIZZ, BUZZ;

  public static Set<FizzBuzz> fizzBuzz(int position) {
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);

    boolean isFizz = position % 3 == 0;
    boolean isBuzz = position % 5 == 0;

    if (position <= 0) {
      throw new IllegalArgumentException("Position must be greater than 0");
    }

    if (isFizz) {
      result.add(FIZZ);
    }

    if (isBuzz) {
      result.add(BUZZ);
    }

    return result;
  }

}
