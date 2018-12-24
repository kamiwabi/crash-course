fun main(args : Array<String>) {

  val kodePos = mutableMapOf("55198" to "Bantul", "55571" to "Griya Purwa Asri")

  println(kodePos["55198"])

  kodePos["55198"] = "Bantul Kota"

  println(kodePos["55198"])
  kodePos["55572"] = "Wedomartani"
  println(kodePos["55572"])
  kodePos.remove("55572")

}
