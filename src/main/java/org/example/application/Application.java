package org.example.application;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Application {

  /**
   * Add two integers.
   *
   * @param  a  the first integer
   * @param  b  the second integer
   * @return    the sum of the two integers
   */
  public static int add(int a, int b) {
    return a + b;
  }

  /**
   * Subtract two integers.
   *
   * @param  a  the first integer
   * @param  b  the second integer
   * @return    the result of subtracting b from a
   */
  public static int subtract(int a, int b) {
    return a - b;
  }

  /**
   * Get Array[] and return its length
   * @param array  array of integers
   * @return       array length
   */
  public static int getArrayLength(int @NotNull [] array) {
    return array.length;
  }

  /**
   * Returns the length of the given list.
   *
   * @param  list  the list of integers
   * @return       the length of the list
   */
  public static int getListLength(@NotNull List<Integer> list) {
    return list.size();
  }

}
