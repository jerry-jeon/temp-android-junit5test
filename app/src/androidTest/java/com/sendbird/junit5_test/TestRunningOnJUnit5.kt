package com.sendbird.junit5_test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

class TestRunningOnJUnit5 {
  @Test
  fun junit5() {
    Assertions.assertEquals(4, 2 + 2)
  }
  @Test
  fun junit5_2() {
    Assertions.assertEquals(4, 2 + 2)
  }
}
