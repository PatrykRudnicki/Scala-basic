package pl.prudnicki.basicScala.module4

import org.scalatest.{Matchers, WordSpec}
import pl.prudnicki.basicScala.module2.{Car, Driver}

class CarSpec extends WordSpec with Matchers {
  "Car drivers test" should {
    "create car without driver" in {
      val car = Car("Mercedes")

      car.driver should be (None)
    }
  }

  "create car with driver" in {
    val driver = Driver("123", 18)
    val car = Car("Ferrari", driver = Some(driver))

    car.driver should be (Some(driver))
  }
}
