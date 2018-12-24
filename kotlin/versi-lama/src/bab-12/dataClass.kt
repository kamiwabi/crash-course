data class Pasien(val nama: String, val alamat: String, var usia: Int)

fun main(args : Array<String>) {

  val pasien1: Pasien = Pasien("Bp. Pasien Satu", "Alamat pasien 1", 38)

  println(pasien1.nama)
  println(pasien1.alamat)
  println(pasien1.usia)
  pasien1.usia = 37
  println(pasien1.usia)
  println("============")
  print(pasien1.toString())

}
