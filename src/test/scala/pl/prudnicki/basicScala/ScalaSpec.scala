package pl.prudnicki.basicScala

import org.scalatest.{Matchers, WordSpec}

class ScalaSpec extends WordSpec with Matchers {
	"One" should {
		"equal one" in {
			1 should equal(1)
		}
	}

	"One" should {
		"not equal two" in {
			1 should not equal(2)
		}
	}
}