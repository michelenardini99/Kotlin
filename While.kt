fun main(args: Array<String>) {
    println("Start typing...")
    
    //readLine()!! legge input da tastiera
    var stringInput = readLine()!!
    var i = 10
    
    while(stringInput != "stop"){
        println(i)
        i--
        stringInput = readLine()!!
    }
}
