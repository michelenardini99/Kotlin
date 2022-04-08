import kotlin.random.Random

fun main(args: Array<String>) {

    val randNum = Random.nextInt(100);
    var attempts = 10
    var victory = false
    var num : Int

    do{
        print("Inserisci il numero: ")
        num = readLine()!!.toInt()
        when{
            num == randNum -> {
                println("Bravo, hai vinto")
                victory = true
            }
            num > randNum -> println("Più alto del mio numero")
            num < randNum -> println("Più basso del mio numero")
        }
        attempts--
    }while(attempts > 1 && !victory)

    if(!victory)
        println("Sfigato, hai perso")

}
