fun main(args: Array<String>) {
    saluta("Mario", 45)
    saluta("Mario")
    saluta()
}

fun saluta(nome: String = "Peppe", anni: Int = 18) = println("Ciao $nome, hai $anni anni")
