/* Si un número X es par o impar */

fun solicitarNumero(): Int {
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

fun ComprobarParidad(numero : Int) {
    if (numero % 2 == 0) {
        println("El numero es Par")
    }
    else {
        println("El numero es Impar")
    }
}

fun main() {
    val numero = solicitarNumero()
    ComprobarParidad(numero)
}
