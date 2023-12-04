package org.example;

import org.example.application.Application;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ApplicationTest {

  @Test
  public void testAdd() {
    int result = Application.add(3, 4);
    assertEquals(7, result);
  }

  @Test
  public void testSubtract() {
    int result = Application.subtract(7, 4);
    assertEquals(3, result);
  }

  @Test
  public void testGetArrayLength() {
    int[] array = new int[] {1, 2, 3};
    int result = Application.getArrayLength(array);
    assertEquals(3, result);
  }

  @Test
  public void testGetListLength() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    int result = Application.getListLength(list);
    assertEquals(3, result);
  }
}