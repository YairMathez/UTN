print("Comprobamos que año es bisiesto")
opcion = int
while opcion != 1:
    num = int(input("Digite el numero "))
    if num % 4 == 0 and num % 100 != 0 or num % 400 == 0:
        print("El año", num, "es bisiesto")
else:
    print("El año " , num, "No es bisiesto")
opcion = int(input("Si quiere terminar el programa presione 1: "))

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
while cont <= num:
    print("Ingrese un numero:", cont)
    suma=cont + cont+1

#Ejercicio 8


