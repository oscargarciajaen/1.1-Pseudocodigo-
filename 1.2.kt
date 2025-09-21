/* La tabla del número X desde 1 hasta el 10 */

fun pedirNumero(): Int {
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

fun tablasDeMultiplicar(numero: Int) {
    for (i in 1..10){
        val multiplicacion = numero * i
        println("$numero * $i = $multiplicacion")
    }
}

fun main() {
    val numero = pedirNumero()
    tablasDeMultiplicar(numero)
}

