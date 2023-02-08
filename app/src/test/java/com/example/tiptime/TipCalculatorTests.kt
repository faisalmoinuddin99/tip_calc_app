package com.example.tiptime

import org.junit.Test

import org.junit.Assert.*
import java.text.NumberFormat

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TipCalculatorTests {

    /*
       These are the two local test cases

     */
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercentage = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculate_30_percent_tip_yes_roundup() {
        val amount = 550.45
        val tipPercent = 30.05
        val expectedTip = NumberFormat.getCurrencyInstance().format(166.00)
        val actualTip = calculateTip(amount = amount, tipPercentage = tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }
}