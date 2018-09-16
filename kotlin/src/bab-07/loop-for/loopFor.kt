fun main(args: Array<String>) {

  println("First")

  val listOfItems = listOf(1, "two", 3, "four")

  for (a in listOfItems) {
    println(a)
  }

  println("Second")

  for (b in 1..10) {
    println(b)
  }

  println("Third")

  for (c in 10 downTo 0 step 2) {
    println(c)
  }

  println("Fourth")

  loop@ for (d in 10 downTo 0) {
    println(d)
    if ((d % 2) == 0)
      break@loop
  }

  println("Fifth")

  for (e in 10 downTo 0) {
    if ((e % 2) == 0)
      continue
    println(e)
  }

}
