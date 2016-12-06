package pl.prudnicki.basicScala.module5

import org.scalatest.{Matchers, WordSpec}

class ProfessionalDriverSpec extends WordSpec with Matchers {
  "Create professional driver with licence" should {
    "create professional driver licence" in {
      val driver = ProfessionalDriver("Patryk", "Rudnicki", "1111")

      driver.driverLicence should be ("1111")
    }
  }
}
