class ContoBancario(val name: String, val lastName: String, var balance: Int){

    init{
        println("E' stato creato un conto a nome di $name $lastName con $balance $")
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

    fun stampaSaldo(){
        println(this.balance)
    }

}

fun main(){
    val conto1 = ContoBancario("Mario", "Rossi", 1000)
    conto1.preleva(100)
    conto1.stampaSaldo()
    conto1.deposita(200)
    conto1.stampaSaldo()
    conto1.preleva(2000)

    val conto2 = ContoBancario("Peppe", "Verdi")
    conto2.preleva(-100)
}
