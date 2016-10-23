package com.persist.uw.examples
import java.lang.Math.floor



// replace ???
// don't use any mutable data
// don't use var
// don't use return
// tests must pass
case class Day(month: Int, day: Int)
{
  object Easter {

    def easter(y: Int): Day = {

      // Divide y by 19 and call the remainder a. Ignore the quotient.
      val a = y % 19;

      // Divide y by 100 to get a quotient b and a remainder c.
      val b = y / 100;
      val c = y % 100;

      // Divide b by 4 to get a quotient d and a remainder e.
      val d = b / 4;
      val e = b % 4;

      // Divide 8 * b + 13 by 25 to get a quotient g. Ignore the remainder.
      val g = (8 * b + 13) / 25;

      // Divide 19 * a + b - d - g + 15 by 30 to get a remainder h. Ignore the quotient.
      val h = (19 * a + b - d - g + 15) % 30;

      // Divide c by 4 to get a quotient j and a remainder k.
      val j = c / 4;
      val k = c % 4;
      // Divide a + 11 * h by 319 to get a quotient m. Ignore the remainder.

      val m = (a + 11 * h) / 319;

      // Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get a remainder r. Ignore the quotient.
      val r = (2 * e + 2 * j - k - h + m + 32) % 7;

      // Divide h - m + r + 90 by 25 to get a quotient n. Ignore the remainder.

      val month = (h - m + r + 90) / 25;

      // Divide h - m + r + n + 19 by 32 to get a remainder p.

      val day = (h - m + r + month + 19) % 32;

      Day(month,day)
    }
  }
}
