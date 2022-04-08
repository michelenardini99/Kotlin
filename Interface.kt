interface Persona {

    val nome: String
    val cognome: String
    fun parla(): String

}

class Impiegato: Persona{

    override val nome: String = "Mario"
    override val cognome: String = "Rossi"

    override fun parla(): String = "Ciao sono Mario"

}

class Pompiere: Persona{

    override val nome: String = "Peppe"
    override val cognome: String = "Il pompiere"

    override fun parla(): String = "Ciao sono un pompiere"
    fun spengoIlFuoco(){ }

}

fun main(){

    val persona1: Persona = Impiegato()
    val persona2: Persona = Pompiere()

}
