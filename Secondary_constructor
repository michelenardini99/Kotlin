class Persona(val nome: String, var età: Int){
    init{
        println("Ciao mi chiamo $nome e la mia età è $età")
    }

    constructor(nome: String): this(nome, 0)

    override fun toString(): String {
        return "Nome: $nome , età: $età"
    }
}

fun main(){
    val mario = Persona("Mario", 3)
    println(mario.toString())
    val peppe = Persona("Peppe")
    println(peppe.toString())
}
