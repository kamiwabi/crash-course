fun main(args: Array<String>) {

    var mobil: IsA<Kendaraan> = IsA<Mobil>()
    var mobil2: SubOf<Mobil> = SubOf<Kendaraan>()

    // let's change to this error:
    
    // var m: IsA<Mobil> = IsA<Kendaraan>()
    // var m2: SubOf<Kendaraan> = SubOf<Mobil>()

    // println(m)
    // println(m2)

    println(mobil)
    println(mobil2)

}

open class Kendaraan
class Mobil : Kendaraan()
class IsA<out T>
class SubOf<in T>
