# P1.1 - Algoritmos en pseudocódigo (RA1.a)

## 1. Si un número X es par o impar

```
    @startuml
    (Obtener Número) --> (Dividir entre 2)
    (Dividir entre 2) --> (Si la división tiene resto 0)
    (Dividir entre 2) --> (Si la división tiene resto 1)
    (Si la división tiene resto 0) --> (Mostrar que el número es par)
    (Si la división tiene resto 1) --> (Mostrar que el número es impar)
    @enduml
```

<img src="1º%20Diagrama.png" width="350" height="250">

- **Python:** [Numero X ¿Par o Impar?](1.1.py)

- **Kotlin:** [Numero X ¿Par o Impar?](1.1.kt)

## 2. La tabla del número X desde 1 hasta el 10

```
    @startuml
    (Numero X)
    (Multiplicador = 0)
    package "Mientras el multiplicacdor es menor o igual a 10"{
        (Multiplicador = 0) --> (Multiplicador + 1)
        (Numero X) --> (Multiplicacion)
        (Multiplicador + 1) --> (Multiplicador > 10)
        (Multiplicador + 1) --> (Multiplicador < 10)
           (Multiplicador < 10) --> (Multiplicacion)
    }
    
    (Multiplicacion) --> (Mostrar Resultado de la operación)
    (Multiplicador > 10) --> (Salir del bucle)
    @enduml
```

- **Python:** [Tablas de Multiplicar de Número X](1.2.py)

- **Kotlin:** [Tablas de Multiplicar de Número X](1.2.kt)

<img src="2º%20Diagrama.png" width="500" height="350">

## 3. Si un número X es primo.


```
    @startuml
    (Numero X)
    (Es <= 1)
    
    (Numero X) --> (Es <= 1)
    (Es <= 1) --> (El Número no es Primo) : Sí
    
    package "Numero de repeticiones desde el Número X hasta 1 (Incluido)" {
      (Es <= 1) --> (Entra al bucle) : No
      (Entra al bucle) --> (Se divide por el Número X)
      (Se divide por el Número X) --> (Si el resto ha sido 0)
      (Si el resto ha sido 0) --> (Contador de divisiones + 1) : Sí
      (Si el resto ha sido 0) --> (Contador + 1) :No
      (Contador + 1) --> (Número Y = Número X - Contador)
      (Número Y = Número X - Contador) --> (Número Y = 0)
      (Número Y = 0) --> (Se divide por el Número X) : No
      (Contador de divisiones + 1) --> (Num máximo de divisiones = 2)
      (Contador de divisiones + 1) --> (Contador + 1)
      (Num máximo de divisiones = 2) --> (Supera el máximo de divisiones)
      (Supera el máximo de divisiones) --> (El Número no es Primo) : Sí
      (Supera el máximo de divisiones) --> (El Número es Primo) : No
      
    }
    (El Número es Primo) --> (Sale del bucle)
    (Número Y = 0) --> (Sale del bucle) : Sí
    @enduml
```

<img src="3º%20Diagrama.png" width="500" height="750">

- **Python:** [Número X ¿Es Primo?](1.3.py)

- **Kotlin:** [Número X ¿Es Primo?](1.3.kt)

**Realizado por: Óscar García Jaén**

**Enviado el 19/09/2025**

**Asignatura: Programación**

