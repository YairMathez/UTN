#Ejercicio calcular la estacion del año
mes = int(input('Digite un mes del año (1 - 12): '))
estacion = None
if mes == 1 or mes == 2 or mes == 3:
    estacion = 'Verano'
elif mes == 4 or mes == 5 or mes == 6:
    estacion = 'Otoño'
elif mes == 7 or mes == 8 or mes == 9:
    estacion = 'Invierno'
elif mes == 10 or mes == 11 or mes == 12:
    estacion = 'Primavera'
else:
    estacion = 'Error , no hay numero para ese mes'
print(f'Para el mes {mes} la estacion es: {estacion}')
#Ejercicio Etapas de la vida

edad = int(input('Digite su edad de 0 a 90'))
etapadevida = None
if edad >= 0 and edad <= 10:
     etapadevida = 'La infancia increible y bella'
elif edad >= 10 and edad <= 19:
     etapadevida = 'Tienes muchos cambios, mucho que estudiar'
elif edad >= 20 and edad <= 29:
     etapadevida = 'Amor y comienza el trabajo'
else:
    etapadevida = 'Usted es un adulto'
print(f"Para la edad {edad} la etapa es: {etapadevida}")

#Ejercicio sistema de calificaciones
valor = float(input('Digite un valor del 1 - 10'))
letra = ''
if valor >= 9 and valor <= 10:
    letra ='A'
elif valor >=8 and valor < 9:
    letra = 'B'
elif valor >=7 and valor <= 8:
    letra = 'C'
elif valor >=6 and valor <= 7:
    letra = 'D'
elif valor >=0 and valor <= 6:
    letra = 'F'
else:
    letra = 'De lo contrario el valor es incorrecto'
print((f'para el valor es {valor} la letra es: {letra}'))




