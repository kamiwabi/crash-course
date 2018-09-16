interface CarInterface {

    val seats: Int
        get() = 4

    // dengan implementasi
    fun printSeats() {
        println(seats)
    }

}

class CarImp : CarInterface {
    override val seats: Int = 2
}

fun main(args : Array<String>) {

  var myCar = CarImp() 

  println(myCar.seats)

}

