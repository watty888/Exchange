/**
  * @author Elcin Bunyatov
  * Matrikelnummer: 01449747
  */

object MainApp{
  def main(args: Array[String]): Unit = {

    val bitcoin = new Bitcoin(1)
    val dollar = new Dollar(100)
    val euro = new Euro(300)

    println(s"Bitcoin in Dollar: ${bitcoin.convert(dollar)}")
    println(s"Bitcoin in Euro: ${bitcoin.convert(euro)}")

    println(s"Dollar in Bitcoin: ${dollar.convert(bitcoin)}")
    println(s"Dollar in Euro: ${dollar.convert(euro)}")

    println(s"Euro in Dollar: ${euro.convert(dollar)}")
    println(s"Euro in Bitcoin: ${euro.convert(bitcoin)}")

  }
}
