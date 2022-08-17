"""print("Comprobamos que año es bisiesto")
opcion = int
while opcion != 1:
    num = int(input("Digite el numero "))
    if num % 4 == 0 and num % 100 != 0 or num % 400 == 0:
        print("El año", num, "es bisiesto")
else:
    print("El año " , num, "No es bisiesto")
opcion = int(input("Si quiere terminar el programa presione 1: "))"""

#Ejercicio 4
n = int(input("Ingrese la cantidad de notas a promediar"))
suma = 0
i = 1
while (i <= n):
    print("Ingrese la nota numero: ",i)
    nota = float(input())
    suma=suma+nota
    i+=1
prom = suma / n
print("El promedio de notas es: ",prom)
#Calcular la suma de N
print("Ingrese un numero: ",suma)
cont = 0
suma = 0
while cont <= suma:
    print("Ingrese un numero:", cont)
    suma=cont + cont+1
####
#Ejercicio 5
num = 8
factorial = 1
k=1
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


