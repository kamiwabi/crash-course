fun main(args : Array<String>) {

  // otomatis Any jika tidak ada deklarasi tipe
  val kabupaten  = arrayOf("Sleman","Kotamadya","Kulon Progo","Gunung Kidul","Bantul")

  println(kabupaten[1])

  // Jika yakin, sertakan type
  var a = arrayOf<String>("nol", "satu", "dua")

  println(a[2])
  println("ambil isi array = " + a.get(2))

  // campuran
  var b = arrayOf<Any>("nol", 1, 2, "tiga", true)

  println(b[4])
  println("Jumlah array b = " + b.size)
  for (i in b) {
    println(i)
  }
  println("Ganti isi array")
  b.set(1,"satu")
  println(b[1])

  val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
  val secondMatrix = arrayOf(intArrayOf(-4, 5, 3), intArrayOf(5, 6, 3))
  
  println(firstMatrix[0][0])
  println(secondMatrix[0][0])

}
