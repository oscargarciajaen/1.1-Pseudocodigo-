/* Si un número X es primo. */

fun introducirNumero(): Int {
    var numero: Int? = null

    while (numero == null) {
        print("Ingresa un número: ")
        numero = readLine()?.toIntOrNull()

        if (numero == null) {
            println("Debe ser un número entero válido.")
        }
    }

    return numero
}

fun ComprobarPrimo(numero: Int){
    if (numero < 0){
        println("Los números negativos no pueden ser primos")
    }
    else if (numero == 0){
        println("El numero no es primo")
    }
    else if (numero == 1){
        println("El numero no es primo")
    }
    else {
        var contadorDivisores = 0
        for (i in numero downTo 1){
            if (numero % i == 0){
                contadorDivisores = contadorDivisores + 1
            }
        }
        if (contadorDivisores > 2) {
            println("El numero no es primo")
        }
        else {
            println("El numero es primo")
        }
    }
}

fun main(){
    val numero = introducirNumero()
    ComprobarPrimo(numero)

}