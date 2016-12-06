package pl.prudnicki.basicScala.module2

import org.scalatest.{Matchers, WordSpec}

class DriverSpec extends WordSpec with Matchers {
  "Method canDrive_? in Driver class" should {
    "return true if driver has 18 or more years old" in {
      val driver1 = Driver("1", 25)
      val driver2 = driver1.copy(age = 14)

      driver1.canDrive_? should be (true)
      driver2.age should be(14)
      driver2.canDrive_? should be (false)
    }
  }
}
