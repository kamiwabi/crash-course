fun main(args: Array<String>) {

    var printIt: (String) -> Unit = { println(it) }
    hof("para peserta training Kotlin", printIt)

}

fun hof(str: String, exp: (String) -> Unit) {
    print("Selamat datang di Wabi ")
    exp(str)
}
