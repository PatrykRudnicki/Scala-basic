package pl.prudnicki.basicScala.module1

import org.scalatest.{Matchers, WordSpec}

class PersonSpec extends WordSpec with Matchers{
	"Case class Person" should {
		"have correct value of fields firstName, lastName and method fullName" in {
			val person = Person("Patryk", "Rudnicki")

			person.firstName should be ("Patryk")
			person.lastName should be ("Rudnicki")
			person.fullName should be ("Patryk Rudnicki")
		}
		"have create a correct object when pass full name" in {
			val person = Person("Patryk Rudnicki")

			person.firstName should be ("Patryk")
			person.lastName should be ("Rudnicki")
			person.fullName should be ("Patryk Rudnicki")
		}
	}
}