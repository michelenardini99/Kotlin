fun main() {
    
    val voto : Int
    voto = 6
    
    when(voto){
        1,2,3,4,5 -> print("Fai molto schifo")
        10 -> print("Bravissimo")
        else -> {
            print("Leggermente bravo")
            print("Ti meriti un bacio")
        }
    }
    
}
