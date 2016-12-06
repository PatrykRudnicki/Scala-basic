package pl.prudnicki.basicScala.module5

import pl.prudnicki.basicScala.module1.SimplePerson

case class ProfessionalDriver(firstName: String, lastName: String, driverLicence: String) extends SimplePerson(firstName, lastName) with Professional {
  override def professionalDriverLicence: String = driverLicence
}
