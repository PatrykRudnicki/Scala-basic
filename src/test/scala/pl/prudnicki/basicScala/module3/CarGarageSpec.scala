package pl.prudnicki.basicScala.module3

import org.scalatest.{Matchers, WordSpec}
import pl.prudnicki.basicScala.module2.Car

class CarGarageSpec extends WordSpec with Matchers {
  "Methods of case class CarGarage" should {
    "findCarByName return a correct car" in {
      val maluch = Car("Fiat 126p")
      val polonez = Car("Polonez")

      val carGarage = CarGarage(Map("Maluch" -> maluch, "Polonez" -> polonez))

      carGarage.findCarByName("Maluch") should be (Some(maluch))
      carGarage.findCarByName("Polonez") should be (Some(polonez))
      carGarage.findCarByName("Porsche") should be (None)
    }

    "countAllModels return a correct amount of the same Car" in {
      val maluch1 = Car("Fiat 126p")
      val maluch2 = Car("Fiat 126p")
      val polonez = Car("Polonez")

      val carGarage = CarGarage(Map("Maluch1" -> maluch1, "Polonez" -> polonez, "Maluch2" -> maluch2))

      carGarage.countAllModels("Fiat 126p") should be (2)
      carGarage.countAllModels("Polonez") should be (1)
    }

    "return correct list of broken cars in alphabetic order" in {
      val maluch1 = Car("Fiat 126p", true)
      val maluch2 = Car("Fiat 126p")
      val polonez = Car("Polonez", true)

      val carGarage = CarGarage(Map("Polonez" -> polonez, "Maluch1" -> maluch1, "Maluch2" -> maluch2))

      carGarage.findBrokenCars should be (maluch1 :: polonez :: Nil)
    }
  }
}
