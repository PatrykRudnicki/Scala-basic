package pl.prudnicki.basicScala.module5

import pl.prudnicki.basicScala.module1.SimplePerson

case class SimpleDriver(firstName: String, lastName: String) extends SimplePerson(firstName, lastName) with Professional
