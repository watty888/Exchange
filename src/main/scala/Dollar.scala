/**
  * @author Elcin Bunyatov
  * Matrikelnummer: 01449747
  */

class Dollar(vl: Double) extends Currency with Printer with Converter {

  override val name: String = "Dollar"
  override val value: Double = vl

  override def print(): Unit = println(s"$name: $value")

  override def convert(to: Currency): Double = {
    if (to.isInstanceOf[Bitcoin]) {
      return this.value / 6400
    }

    if (to.isInstanceOf[Euro]) {
      return this.value * 0.88
    }

    this.value
  }
}