package pl.prudnicki.basicScala.module5

import org.scalatest.{Matchers, WordSpec}
import pl.prudnicki.basicScala.module2.{Car, Driver}
import pl.prudnicki.basicScala.module3.CarGarage

class CarGarageSpec extends WordSpec with Matchers {
  "Method ready_? from CarGarage" should {
    "return true if age is over 18, car is not broken and it is mercedes" in {
      val car =  Car("mercedes", false, Some(Driver("123", 20)))

      CarGarage.ready_?(car) should be (true)
    }
    " return false if age is under 18 or car is broken or car isn't mercedes" in {
      val car1 = Car("mercedes", true, Some(Driver("123", 20)))
      val car2 = Car("mercedes", false, Some(Driver("123", 17)))
      val car3 = Car("toyota", false, Some(Driver("123", 20)))

      CarGarage.ready_?(car1) should be (false)
      CarGarage.ready_?(car2) should be (false)
      CarGarage.ready_?(car3) should be (false)
    }
  }
}
