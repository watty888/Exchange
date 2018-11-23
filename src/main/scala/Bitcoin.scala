class Bitcoin(value: Int) extends Currency("Bitcoin", value) with Printer {

  override def print(): Unit = println(s"$name: $value")

}