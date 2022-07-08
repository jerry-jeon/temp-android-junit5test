package com.sendbird.junit5_test

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.jupiter.api.Assertions

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun junit4_1() {
        Assertions.assertEquals(4, 2 + 2)
    }
    @Test
    fun junit4_2() {
        Assertions.assertEquals(4, 2 + 2)
    }
    @Test
    fun junit4_3() {
        Assertions.assertEquals(4, 2 + 2)
    }
    @Test
    fun junit4_4() {
        Assertions.assertEquals(4, 2 + 2)
    }
}