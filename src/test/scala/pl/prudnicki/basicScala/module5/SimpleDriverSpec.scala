package pl.prudnicki.basicScala.module5

import org.scalatest.{Matchers, WordSpec}
class SimpleDriverSpec extends WordSpec with Matchers{
  "Create a simple driver" should {
    "create a default value of proffesional driver licence" in {
      val driver = SimpleDriver("Patryk", "Rudnicki")

      driver.professionalDriverLicence should be ("missing")
    }
  }
}
