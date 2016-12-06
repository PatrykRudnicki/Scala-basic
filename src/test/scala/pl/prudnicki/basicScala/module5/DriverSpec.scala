package pl.prudnicki.basicScala.module5

import org.scalatest.{Matchers, WordSpec}
import pl.prudnicki.basicScala.module2.Driver

class DriverSpec extends WordSpec with Matchers {
  "Create Driver" should {
    "Not define a driving type licence when it's not added" in {
      val driver = Driver("123", 20)

      driver.driverType should be (None)
    }
    "define a normal driving type licence" in {
      val driver = Driver("123", 20, Some(DriverType.Normal))

      driver.driverType should be (Some(DriverType.Normal))
    }
    "define a professional driving type licence" in {
      val driver = Driver("123", 20, Some(DriverType.Professional))

      driver.driverType should be (Some(DriverType.Professional))
    }
  }
  "Method driverLicence" should {
    "return only licenceId if driverType is not define" in {
      val driver = Driver("123", 22)

      driver.driverLicence should be ("123")
    }
    "return only licenceId if driverType is Missing" in {
      val driver = Driver("123", 22, Some(DriverType.Missing))

      driver.driverLicence should be ("123")
    }
    "return licenceId with driverType if driverType is Normal or Professional" in {
      val driver1 = Driver("123", 22, Some(DriverType.Normal))
      val driver2 = Driver("123", 22, Some(DriverType.Professional))

      driver1.driverLicence should be ("Normal 123")
      driver2.driverLicence should be ("Professional 123")
    }
  }
}
