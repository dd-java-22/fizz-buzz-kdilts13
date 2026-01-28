package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EnumSet;
import java.util.Set;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 13})
  void fizzBuzz_Number(int position) {
    Set<FizzBuzz> actual = FizzBuzz.fizzBuzz(position);
    Set<FizzBuzz> expected = EnumSet.noneOf(FizzBuzz.class);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 99})
  void fizzBuzz_Fizz(int position) {
    Set<FizzBuzz> actual = FizzBuzz.fizzBuzz(position);
    Set<FizzBuzz> expected = EnumSet.of(FizzBuzz.FIZZ);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 95})
  void fizzBuzz_Buzz(int position) {
    Set<FizzBuzz> actual = FizzBuzz.fizzBuzz(position);
    Set<FizzBuzz> expected = EnumSet.of(FizzBuzz.BUZZ);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {15, 30, 90})
  void fizzBuzz_FizzBuzz(int position) {
    Set<FizzBuzz> actual = FizzBuzz.fizzBuzz(position);
    Set<FizzBuzz> expected = EnumSet.of(FizzBuzz.FIZZ, FizzBuzz.BUZZ);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {0, -1, -25})
  void fizzBuzz_Invalid(int position) {
    assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(position));
  }
}