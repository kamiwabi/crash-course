fun main(args : Array<String>) {

  val buah = mutableListOf("Jeruk", "Alpukat", "Mangga", "Edamame")

  buah.add("Nangka")
  for (a in buah) {
    println(a)
  }

  val buah2 = listOf("Manggis", "Durian", "Manggis")

  // try this:
  //buah2.add("Duku")
  for (i in buah2) {
    println(i)
  }

}
