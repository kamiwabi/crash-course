import java.io.File

fun main(args : Array<String>) {

  val a = 10.0
  val b = 200
  var c: Double

  val name = "Wabi"
  val company = name
  val difName = "Wabi"

  val f1 = File("/etc/passwd")
  val f2 = File("/etc/passwd")

  c = 10.5

  println(a > b)
  println(a+b)
  println(a/b)

  c += a
  println(c)

  c %= a
  println(c)

  c++
  println(c)

  println(!(a > b))

  println(a==10.0)
  println(company===name)
  println(name=="Wabi")
  println(company===difName)
  println(f1===f2)

}
