fun main(args: Array<String>) {

   val myCar = Car("First Car", 4)

   println("Car name = ${myCar.brand}")
   println("Seats = ${myCar.seats}")
   println("Type = " + myCar.carType)

}

class Car(val brand: String, var seats: Int) {

  var carType: String

  init {

    if (seats == 2)
      carType = "Sport"
    else if (seats > 4)
      carType = "Kendaraan umum"
    else
      carType = "Unknown car"

  }

}
