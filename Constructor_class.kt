class Persona constructor(val name: String, val lastName: String, var age: Int)

fun main(){
    val giuseppe = Persona("Giuseppe", "Rossi", 10)
    giuseppe.age = 11
    print(giuseppe.age)
}
