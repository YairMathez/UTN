# lista = Ariel ,Liliana, Natalia, Osvaldo
#Colecciones en Python

nombres = ['Naty', 'Liliana', 'Osvaldo', 'Ariel']
print(nombres)
print(nombres[0:2]) #Solo muestra el indice 0, 1 pero no el indice 2
# Ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3]) # Indices a mostrar 0, 1 ,2
# Desde el indice indicado hasta el final
print(nombres[1: ])
# Modificamos un valor
nombres [3] = 'Liliana'
nombres [0] = 'Natalia'
print(nombres)
# Iterar una lista
for nombre in nombres: # Nombre es singular , la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

#Preguntamos cuantos elementos tiene
print(len(nombres)) #Le pasamos un parametro (la lista)
#Agregamos un elemento
nombres.append('Marcelo')
print(nombres)
# Insertar un elemento en un indice especifico
nombres.insert(1 , 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)
# Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)
# Eliminar el ultimo elemento
nombres.pop()
print(nombres)
# Eliminar un indice especifico
del nombres[2] # del siginifca delete (eliminar)
print(nombres)
# Eliminar , borrar , o limpiar todos los elementos
nombres.clear()
print(nombres)
# Elimar la lista
del nombres
print(nombres)

# Definimos una tupla
cocina = ('Cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

# Acceder a un elemento , para esto utilizamos los corchetes no parantesis
print(cocina[0])
# Mostrar de manera inversa
print(cocina[-1])
# Acceder a un rango
print(cocina[0:1])
# Ejemplo
verduras = ('Papa', 'zanahoria', 'Palta')
print(verduras)

# Tuplas parte 2. Recorremos los elementos de la tupla
for cocinar in cocina:  # Print esta usando lo que es el backslash (\n) para dar saltos de linea.S
    print(cocinar, end='')  # Usamos end= para eliminar los saltos de linea

cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# Tipo set
planetas = {'Mercurio', 'Jupiter', 'Marte'}
print(len(planetas))  # Usamos la funcion len = length singnifica largo

# Revisar si un elemento existe dentro del set
print('Marte' in planetas)

# Agregar un elemento
planetas.add('Tierra')  # Add es una funcion
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove('Marte')
print(planetas)
planetas.discard('Marte')
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set o conjunto
###del planetas
# print(planetas)

# 'Maradona':10 Un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key,value)
diccionario = {
    'IDE': 'Integrated Development Environment',
    'POO': 'Programacion orientada a objetos',
    'SABD': 'Sistema de administracion de datos',
}
print(len(diccionario))
print(diccionario)

# Acceder a un dicionario con la llave (key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificar elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Recorrer los elementos
for termino in diccionario:
    print(termino)

for termino in diccionario: #Recorremos mostrando solo las llaves
    print(termino)

#Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino,valor)

#Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) # Muestra solo las llaves

for valor in diccionario.values(): #Usamos una funcion para acceder al valor
    print(valor)

#Comprobar la existencia de algun elemento
print('IDE' in diccionario) # Devuelve un booleano

#Agregar un elemento
diccionario['PK'] = 'Primary key'
print(diccionario)

#Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

#Vaciar un diccionario
diccionario.clear()
print(diccionario)

#Eliminar diccionario
del diccionario # el diccionario se borro

#Concatenamos listas
lista1 = [1,2,3,1]
lista2 = [4,5,6,1]
lista3 = lista1+lista2
print(lista3)

lista3.extend([7,8,9,1])
print(lista3)

print(lista3.index(5))
#print(lista3.index(0)) es un error por no ser elemento parte de la lista

#Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1)) #Cuenta cuantos valores iguales hay adentro de la lista

# Para poner nuestaa lista al reves
lista3.reverse()
print(lista3)

#Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

#Metodos de ordenamiento
lista3.sort() #Ordena asendentemente
print(lista3)
lista3.sort(reverse=True)
print(lista3)

tupla = (4, 'Hola' ,6.78, [1,2,78], 4, 'Hola')
print(tupla)

#Ejercicio Colecciones
lista = (Yair, Pancho, Gustavo, Julian)
lista = []
for lista in lista
    if lista <5:
        lista.append(lista)
print(lista)