#Ejercicio 5
num = int(input("Digite un numero:"))
factorial = 1
k=1

while(num<=0):
    print("El numero ingresado es menor a 0:")
    num = int(input("Digite un numero:"))
while(k<=num):
    factorial = k*factorial
    k=k +1
    print(factorial)

#Ejercicio 6
def contar_pares_impares(lista):
    pares, impares = 0, 0


    for n in lista:
        if n % 2 == 0:
            pares+=1

        else:
            impares += 1


    return pares, impares

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
resultado = contar_pares_impares(numeros)

print("La cantidad de pares es: %i" % resultado[0])
print("La cantidad de impares es: %i" % resultado[1])

#Ejercicio 7
suma = 0
promedio = 0
conta = 0

while True:
    salario = int(input("Ingrese el salario"))
    print("El salario es:",salario)
    suma += salario
    conta+=  1
    pregunta = input("¿Desea agregar mas salarios? 1 -Si o 2 -No")
    if pregunta == "2":
        break
    promedio = suma / conta

    print("\nEltotal de los salarios es %d:" %suma)
    print("El promedio de los salarios es: %.2f"%promedio)

