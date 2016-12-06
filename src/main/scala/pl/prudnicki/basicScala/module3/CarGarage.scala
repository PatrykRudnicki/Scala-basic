package pl.prudnicki.basicScala.module3

import pl.prudnicki.basicScala.module2.{Car, Driver}

case class CarGarage(cars: Map[String, Car]) {
  def findCarByName(carModel: String): Option[Car] = cars.find(_._1 == carModel).map(_._2)

  def countAllModels(carModel: String): Int = cars.count(_._2.make == carModel)

  def findBrokenCars: Seq[Car] = cars.filter(_._2.broken).values.toSeq.sortBy(_.make)

  def readyCars: Seq[Car] = cars.filter(_._2.driver.isDefined).values.toSeq

  def readyDrivers: Seq[Driver] = readyCars.flatMap(_.driver)

  def readyDrivers2: Seq[Driver] = {
    for {
      car <- readyCars
    } yield car.driver
  }.flatten
}

object CarGarage {
  def ready_?(car: Car): Boolean = {
    car match{
      case Car(make, broken, Some(Driver(_, age, _))) if make == "mercedes" && !broken && age >= 18 => true
      case _ => false
    }
  }
}
