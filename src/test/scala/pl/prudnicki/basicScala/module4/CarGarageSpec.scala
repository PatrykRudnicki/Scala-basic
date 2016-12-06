package pl.prudnicki.basicScala.module4

import org.scalatest.{Matchers, WordSpec}
import pl.prudnicki.basicScala.module2.{Car, Driver}
import pl.prudnicki.basicScala.module3.CarGarage

class CarGarageSpec extends WordSpec with Matchers {
  "CarGarage methods" should {
    "return list of cars with drivers" in {
      val driver1 = Driver("123", 18)
      val driver2 = Driver("321", 22)
      val car1 = Car("Mercedes", driver = Some(driver1))
      val car2 = Car("Ferrari")
      val car3 = Car("Porsche", driver = Some(driver2))

      val carGarage = CarGarage(Map("Mercedes" -> car1, "Ferrari" -> car2, "Porsche" -> car3))

      carGarage.readyCars should be (car1 :: car3 :: Nil)
    }
    "return list of drivers assigned to cars" in {
      val driver1 = Driver("123", 18)
      val driver2 = Driver("321", 22)
      val car1 = Car("Mercedes", driver = Some(driver1))
      val car2 = Car("Ferrari")
      val car3 = Car("Porsche", driver = Some(driver2))

      val carGarage = CarGarage(Map("Mercedes" -> car1, "Ferrari" -> car2, "Porsche" -> car3))

      carGarage.readyDrivers should be (driver1 :: driver2 :: Nil)
      carGarage.readyDrivers2 should be (driver1 :: driver2 :: Nil)
    }
  }
}
