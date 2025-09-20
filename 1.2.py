# La tabla del número X desde 1 hasta el 10

def solicitarNumero():
    numero = 0
    while numero == 0:
        try:
            numero = int(input("Ingresa un numero: "))
            return numero
        except ValueError:
            print("El valor ingresado no es un numero")

def tablasDeMultiplicar(numero):
    for i in range(1, 11):
        print(numero * i)

def main():
    numero = solicitarNumero()
    tablasDeMultiplicar(numero)

if __name__ == "__main__":
    main()