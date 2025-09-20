# Si un número X es primo.

def solicitarNumero():
    numero = 0
    while numero == 0:
        try:
            numero = int(input("Introduce un numero para comprobar si es primo: "))
            return numero
        except ValueError:
            print("El Valor ingresado no es un numero")

def ComprobarPrimo(numero):
     if numero < 0:
         print("Los números negativos no pueden ser primos")
     elif numero ==  0 or numero == 1:
         print("El numero no es primo")
     else:
        contadorDivisores = 0
        for i in range(numero, 1, -1):
            if numero % i == 0:
                contadorDivisores += 1
            else:
                continue
        if contadorDivisores > 2:
            print("El numero no es primo")
        else:
            print("El numero es primo")

def main():
    numero = solicitarNumero()
    ComprobarPrimo(numero)

if __name__ == "__main__":
    main()
