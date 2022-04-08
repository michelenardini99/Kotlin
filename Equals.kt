import ContoBancario.Companion.convertiInDollari

class ContoBancario(val name: String, val lastName: String, var balance: Int){

    companion object{
        fun convertiInDollari(balanceInEuro: Int): Double = balanceInEuro*1.19
    }

    init{
        println("E' stato creato un conto a nome di $name $lastName con $balance€")
    }

    constructor(name: String, lastName: String): this(name, lastName, 0)

    fun preleva(quantity: Int){
        if(this.balance > quantity && quantity > 0)
            this.balance-=quantity
        else if(quantity < 0)
            println("Errore: Impossibile prelevare")
        else
            println("Errore: Non ci sono abbastanza soldi")
    }

    fun deposita(quantity: Int){
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

}

fun main(){
    val conto1 = ContoBancario("Mario", "Rossi", 1000)
    val conto2 = ContoBancario("Mario", "Rossi", 1000)
    print(conto1.equals(conto2))
}
