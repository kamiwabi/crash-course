fun main(args : Array<String>) {

  val buah = mutableSetOf("Jeruk", "Alpukat", "Mangga", "Edamame")

  buah.add("Jeruk")
  for (a in buah) {
    println(a)
  }

  println("==========")

  buah.add("Pisang")
  for (x in buah) {
    println(x)
  }

}
