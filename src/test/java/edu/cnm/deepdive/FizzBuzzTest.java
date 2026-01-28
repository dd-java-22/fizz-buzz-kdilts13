package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 13})
  void fizzBuzz_Number(int position) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String actual = fizzBuzz.fizzBuzz(position);

    String expected = Integer.toString(position);
//    String expected = String.valueOf(position);
//    String expected = "%d".formatted(position);
//    String expected = "" + position;

    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 99})
  void fizzBuzz_Fizz(int position) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String actual = fizzBuzz.fizzBuzz(position);
    String expected = "Fizz";
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 95})
  void fizzBuzz_Buzz(int position) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String actual = fizzBuzz.fizzBuzz(position);
    String expected = "Buzz";
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {15, 30, 90})
  void fizzBuzz_FizzBuzz(int position) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String actual = fizzBuzz.fizzBuzz(position);
    String expected = "FizzBuzz";
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {0, -1, -25})
  void fizzBuzz_Invalid(int position) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertThrows(IllegalArgumentException.class, () -> fizzBuzz.fizzBuzz(position));
  }
}