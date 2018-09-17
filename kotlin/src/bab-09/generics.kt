fun main(args: Array<String>) {

    var aString = GenClass("Ini menggunakan parameter String")
    var bInt: GenClass<Int> = GenClass(3431)

    println(aString.theArg)
    println(bInt.theArg)

}

class GenClass<T>(arg: T) {

    var theArg = arg

}
