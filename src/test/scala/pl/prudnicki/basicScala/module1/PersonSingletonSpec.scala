package pl.prudnicki.basicScala.module1

import org.scalatest.{Matchers, WordSpec}

class PersonSingletonSpec extends WordSpec with Matchers {
  "PersonalSingleton object" should {
    "have correct value of fullName with assign" in {
      PersonSingleton.fullName = "Patryk Rudnicki"

      PersonSingleton.fullName should be ("Patryk Rudnicki")
    }
    "have correct value without assign" in {
      PersonSingleton.fullName should be ("Patryk Rudnicki")
    }
  }
}
