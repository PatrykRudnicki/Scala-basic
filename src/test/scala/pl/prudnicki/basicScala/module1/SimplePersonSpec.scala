package pl.prudnicki.basicScala.module1

import org.scalatest.{Matchers, WordSpec}

class SimplePersonSpec extends WordSpec with Matchers {
	"Method fullName from SimplePerson class" should {
		"return a correct full name" in {
			val person = new SimplePerson("Patryk", "Rudnicki")

			person.fullName should be ("Patryk Rudnicki")
		}
	}
}