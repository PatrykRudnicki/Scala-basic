package pl.prudnicki.basicScala.module1

case class Person(firstName: String, lastName: String) {
	def fullName: String = firstName + " " + lastName
}

object Person {
  def apply(fullName: String): Person = {
    val fullNameSplit = fullName.split(" ")

    Person(fullNameSplit(0), fullNameSplit(1))
  }
}