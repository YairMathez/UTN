#Ejercicio Tuplas y listas
tupla = (13, 1, 8, 3, 2, 5, 8)

lista = []
for lista in tupla:
    if lista <5:
        lista.append(lista)
print(lista)
