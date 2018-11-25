/**
  * @author Elcin Bunyatov
  * Matrikelnummer: 01449747
  */

class Euro(vl: Double) extends Currency with Printer with Converter {

  override val name: String = "Euro"
  override val value: Double = vl

  override def print(): Unit = println(s"$name: $value")

  override def convert(to: Currency): Double = {
    if (to.isInstanceOf[Bitcoin]) {
      return this.value / 5600
    }

    if (to.isInstanceOf[Dollar]) {
      return this.value * 1.14
    }

    this.value
  }
}