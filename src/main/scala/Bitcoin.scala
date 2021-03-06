/**
  * @author Elcin Bunyatov
  * Matrikelnummer: 01449747
  */

class Bitcoin(vl: Double) extends Currency with Printer with Converter {

  override val name: String = "Bitcoin"
  override val value: Double = vl

  override def print(): Unit = println(s"$name: $value")

  override def convert(to: Currency): Double = {
    if (to.isInstanceOf[Dollar]) {
      return this.value * 6400
    }

    if (to.isInstanceOf[Euro]) {
      return this.value * 5600
    }

    this.value
  }
}