#  Si un número X es par o impar

def solicitarNumero():
    numero = 0
    while numero == 0:
        try:
            numero = int(input("Ingresa un numero: "))
            return numero
        except ValueError:
            print("El valor ingresado no es un numero")


def comprobarParidad(numero):
    if numero % 2 == 0:
        print("El numero es par")
    else:
        print("El numero es impar")

def main():
    numero = solicitarNumero()
    comprobarParidad(numero)

if __name__ == "__main__":
    main()