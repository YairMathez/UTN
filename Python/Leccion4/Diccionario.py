#Ejercicio Tuplas y listas
tupla = (13, 1, 8, 3, 2, 5, 8)

lista = []
for lista in tupla:
    if lista <5:
        lista.append(lista)
print(lista)
#Ejercicio coleciones
lista = [1, 2, 3, 'Yair', 9, 9, 3, 'Racing', 5, 'River']
conjuntos =set(lista)
print(conjuntos)
lista = list(conjuntos) # Convertimos el conjunto a una lista
print(lista)