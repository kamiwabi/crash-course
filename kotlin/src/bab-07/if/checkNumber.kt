fun main(args: Array<String>) {

    var angka = 2
    val res = if (angka > 0)
        "positif"
    else if (angka < 0)
        "negatif"
    else
        "nol"
    println("angka $angka adalah angka $res")

    angka  =  -2
    var res1: String
    if (angka > 0)
        res1 = "positif"
    else if (angka < 0)
        res1 = "negatif"
    else
        res1 = "nol"
    println("angka $angka adalah angka $res1")

}
