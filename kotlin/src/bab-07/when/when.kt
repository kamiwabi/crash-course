fun main(args : Array<String>) {

  val a = 200

  when (a) {
    15 -> println("a = 15")
    in 20..30 -> println("berada dalam range 20 - 30")
    16, 18 -> println("16 atau 18")
    !in 100..1000 -> println("tidak berada di antara 100 - 1000")
    else -> {
      println("Tidak masuk semua")
      println("Ini menggunakan lebih satu statement, jadi harus dengan block")
    }
  }

}
