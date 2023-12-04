package org.example;

import org.example.application.Application;
import org.junit.Test;
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
}