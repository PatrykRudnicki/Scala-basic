package pl.prudnicki.basicScala.module2

case class Car(make: String, broken: Boolean = false, driver: Option[Driver] = None) {
  def openCloseCar(distance: Int, isBatteryCharged: Boolean = true): String = {
    if(isBatteryCharged && distance < 50) {
      s"$make opened"
    } else if (isBatteryCharged){
      s"Too large distance to the $make"
    } else {
      s"Uncharged battery"
    }
  }
}
