package pl.prudnicki.basicScala.module2

import pl.prudnicki.basicScala.module5.DriverType
import pl.prudnicki.basicScala.module5.DriverType.Missing

case class Driver(licenceId: String, age: Int, driverType: Option[DriverType] = None) {
  def canDrive_? : Boolean = age >= 18

  def driverLicence: String = {
    driverType match {
      case Some(typeOfLicence) if typeOfLicence != Missing => s"$typeOfLicence $licenceId"
      case _ => licenceId
    }
  }
}
