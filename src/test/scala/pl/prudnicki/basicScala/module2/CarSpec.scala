package pl.prudnicki.basicScala.module2

import org.scalatest.{Matchers, WordSpec}

class CarSpec extends WordSpec with Matchers {
  "Distance is lower than 50 and battery has default value" should {
    "open car" in {
      val car = Car("Toyota")

      car.openCloseCar(30) should be ("Toyota opened")
      car.openCloseCar(30, false) should be ("Uncharged battery")
      car.openCloseCar(60, true) should be ("Too large distance to the Toyota")
    }
  }
}
