fun main() {
    
    val voto : Int
    voto = 6
    
    if(voto>=7){
        print("Bravo")
    }else if(voto == 6){
        print("Appena bravo")
    }else{
        print("Studia di più")
    }
    
    print(if(voto==10){"Eccellente"}else{"Non eccellente"})
    
}
