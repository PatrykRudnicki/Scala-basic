package pl.prudnicki.basicScala.module1

import org.scalatest.{Matchers, WordSpec}

class AutoPersonSpec extends WordSpec with Matchers {
	"AutoPerson object" should {
		"have correct full name" in{
			val person = AutoPerson("Patryk", "Rudnicki")

			person.firstName should be ("Patryk")
			person.lastName should be ("Rudnicki")
			person.fullName should be ("Patryk Rudnicki")
		}
	}
}