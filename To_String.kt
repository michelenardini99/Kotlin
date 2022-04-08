class Persona(val nome: String, var età: Int){
    init{
        println("Ciao mi chiamo $nome e la mia età è $età")
    }

    override fun toString(): String {
        return "Nome: $nome , età: $età"
    }
}

fun main(){
    val mario = Persona("Mario", 3)
    println(mario.toString())
}
