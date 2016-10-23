package com.persist.uw.examples

import org.scalatest.FunSuite


class EasterTest extends FunSuite {

  test("testEaster1") {
    //"2016" >> (Easter.easter(2016) mustEqual Day(3, 27))
    //"1761" >> (Easter.easter(1761) mustEqual Day(3, 22))
    //"2038" >> (Easter.easter(2038) mustEqual Day(4, 25))

    val day1 = new Day(3,27)
    assert(day1.Easter.easter(2016) == day1)
  }

  test("testEaster2")
  {
    val day2 = new Day(3,22)
    assert(day2.Easter.easter(1761) == day2)
  }

  test("testEaster3")
  {
    val day3 = new Day(4,25)
    assert(day3.Easter.easter(2038) == day3)
  }

  test("testEaster4")
  {
    val day4 = new Day(4,9)
    assert(day4.Easter.easter(2023) == day4)
  }
}