// penggunaan "open" supaya masih bisa dilakukan inheritance
open class Car(seats: Int, brand: String) {
  init {
    println(brand)
    println("Number of seats: " + seats)
  }
}

class Truck(wheels: Int, seats: Int, brand: String): Car(seats, brand) {

    init {
      println(brand)
      println(seats)
      println(wheels)
    }

}

fun main(args: Array<String>) {
    val truck1 = Truck(6, 2, "Isuzu")
    println(truck1)
}

