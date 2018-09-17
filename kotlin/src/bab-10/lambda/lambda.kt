fun main(args: Array<String>) {

    var lambdaOne :(String)->Unit  = {s:String -> println(s)}
    lambdaOne("Argumen 1")

    val sum = { x: Int, y: Int -> x + y }

    println(sum(2,3))

    val tanpaArg : () -> Unit = { println("Kosong")}
    tanpaArg()

}

