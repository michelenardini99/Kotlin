class Persona(val nome: String, var età: Int){
    init{
        println("Ciao mi chiamo $nome e la mia età è $età")
    }
}

fun main(){
    val mario = Persona("Mario", 3)
    val peppe = Persona("Peppe", 30)
}
