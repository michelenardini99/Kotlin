fun main(){
    calcoloMoltoComplesso({print("Tutto ok")}, {print("Kernel panic!")})
}

fun calcoloMoltoComplesso(success:()->Unit, error:()->Unit){
    val risultato = true

    if(risultato)
        success()
    else
        error()
}
