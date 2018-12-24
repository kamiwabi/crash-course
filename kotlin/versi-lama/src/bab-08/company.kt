class Company {

  private var name: String = "Wabi"
   
  fun printName() {
    println(name)
  }

  fun getName(): String {
    return name
  }

}

fun main(args: Array<String>) {
  val myCompany = Company()
  myCompany.printName()
  var myCompanyName = myCompany.getName()
  println(myCompanyName)
}
