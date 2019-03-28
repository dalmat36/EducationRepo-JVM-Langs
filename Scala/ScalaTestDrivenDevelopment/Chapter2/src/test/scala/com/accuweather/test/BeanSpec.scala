package com.accuweather.test

import `object`.packt.{Binary, Decimal}
import org.scalatest.FlatSpec

class BeanSpec extends FlatSpec {
  //JUnit Style
  "Decimal" should "throw error when initalised with a non numeric string" in {
    try {
      Decimal("XYZ")
    }
    catch {
      case e: IllegalArgumentException =>
        assert(e.getMessage == "requirement failed: Unable to convert string to number")
      case _ : Throwable => fail
    }
  }

  //ScalaTest Intercept Style
  "Binary" should "throw error when initalised with a non numeric string" in {
    intercept[IllegalArgumentException] {
      Binary("XYZ")
    }
  }
}