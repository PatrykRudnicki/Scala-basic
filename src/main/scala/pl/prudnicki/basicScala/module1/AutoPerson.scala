package pl.prudnicki.basicScala.module1

case class AutoPerson(firstName: String, lastName: String) {
  var fullName: String = ""

  fullName = firstName + " " + lastName
}