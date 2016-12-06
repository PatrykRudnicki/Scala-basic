package pl.prudnicki.basicScala.module3

import org.scalatest.{Matchers, WordSpec}

class CarMileageSpec extends WordSpec with Matchers {
  "Init CarMileage using seq" should {
    "is the same as sequence using elem::Nil" in {
      val carMileage = CarMileage(Seq(1.0,2.2,3.5))

      carMileage.mileage should be (1.0::2.2::3.5::Nil)
    }
  }
}
