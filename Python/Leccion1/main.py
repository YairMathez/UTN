'''
miVariable = 3
print(miVariable)
miVariable = "a"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x624
print(id(y))
print(id(z))
a = False
print(type(a))
# Tipos int , float , string, bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
x = "Hola alumnos"
print(x)
print(type(x))
x = True
x = False
print(type(x))

#Manejo de cadenas (String)
miGrupoFavorito =  "The Letter Black"
caracteristicas = "The best Rock Band"
print("Mi grupo favorito es:" , miGrupoFavorito , caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos de boleanos (bool)
miBoleano = 3 > 2
print(miBoleano)

if miBoleano:
    print("El resultado es Verdadero")

else:
    print("El resultado es falso")


 # Procesar la entrada del usuario



resultado = input ( "Digite el numero:  " )   #  regresa un dato tipo string
print(resultado)

# Conversion de la entrada de datos
numero1 = input( " Escribe el primer numero ")
numero2 = input( "Escribe el segundo numero ")
resultado = numero1 + numero2
print( " El resultado de la suma es :", resultado )

miVariable = input( " Como estuvo tu dia del 1 al 10 ")
print( " Mi dia estuvo " , miVariable )



miLibroFavorito = " El arte de no amargarse la vida "
autor = "Rafael santadeur"
caracteristicas = " Psicoanalisis "
print ( "Mi libro favorito es ", miLibroFavorito ,"Y su autor es", autor , "Y sus caracteristicas son", caracteristicas)

nam = input("¿quien eres?")
print("Bienvenido", nam )

#Problema clase
num = int(input("Digite un número: "))
if num % 2 == 0:
print(f"el número {num} es par")
else:print(f"el número {num} es impar")
'''
"""
#Operadores arismeticos
operandoA = 8
operandoB = 5
suma= operandoA + operandoB
print("Resultado de la suma:",suma)
print(f'El resultado de la suma es: {suma}')
#Problema del rectangulo
alto =int(input("Proporciona el alto del rectangulo:"))
ancho = int(input("Proporciona el ancho del rectangulo:"))
area = alto * ancho
perimeto = (alto + ancho) * 2
print("Area", area)
print("Perimetro", perimeto)
"""
####Ejercicio
miVariable3 = 10
print(miVariable3)
#Operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)
miVariable3 += 1
miVariable3 -= 2
print(miVariable3)
miVariable3 *= 3
print(miVariable3)
miVariable3 /= 2
print(miVariable3)

#Operadores de comparacion
d = 4
b = 2
resultado = d == b
print(resultado)

#Operador diferente
resultado = d != b
print(resultado)
#Operador mayor que
resultado = d > b
print(resultado)

#Operador menor que
resultado = d < b
print(resultado)

#Operador menor o igual que
resultado = d <= b
print(resultado)
####
a = int(input("Digite su numero:"))
print(f"El residuo de la division es:{a% 2} ")
if a % 2 ==0:
    print(f"El valor de a es : {a} es un numero PAR")
else:print(f"El valor de a es : {a} es un numero IMPAR")










