


class ContoBancaSella(override val name: String,override val lastName: String,override var balance: Int): ContoBancario(name, lastName, balance){

    init{
        println("Creazione conto banca sella")
    }

    fun mostraSaldoInBTC(){
        println(balance*9400)
    }

}

open class ContoBancario(open val name: String,open val lastName: String,open var balance: Int){

    companion object{
        fun convertiInDollari(balanceInEuro: Int): Double = balanceInEuro*1.19
    }

    init{
        println("E' stato creato un conto a nome di $name $lastName con $balance€")
    }

    constructor(name: String, lastName: String): this(name, lastName, 0)

    infix fun preleva(quantity: Int){
        if(this.balance > quantity && quantity > 0)
            this.balance-=quantity
        else if(quantity < 0)
            println("Errore: Impossibile prelevare")
        else
            println("Errore: Non ci sono abbastanza soldi")
    }

    infix fun deposita(quantity: Int){
        this.balance+=quantity
    }

    fun stampaSaldo() = println("$balance€")

    fun mostraSaldoInDollari() = println(convertiInDollari(balance))

    override fun equals(other: Any?): Boolean {

        other as ContoBancario

        if(other.name != this.name) return false
        if(other.lastName != this.lastName) return false
        if(other.balance != this.balance) return false

        return true
    }

    override fun toString(): String = "$name $lastName $balance"

}

fun main(){
    val conto1 = ContoBancaSella("Mario", "Rossi", 1000)

    println(conto1)

    //conto1.deposita(100)
    conto1 deposita 100

    println(conto1)

    conto1 preleva 100

    println(conto1)

    conto1.mostraSaldoInBTC()
}
