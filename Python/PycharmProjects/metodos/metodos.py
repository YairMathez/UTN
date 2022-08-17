x = range(3, 10 , 2)
for n in x:
    print(n)

print("\n")

y = range(10)
for n in y:
    if n % 3 ==0:
        print(n)
print("\n")

z = range (2, 7)
for n in z:
    print(n)
print("\n")
print('Rango de 0 a 10 con numeros divisibles entre 3')
for i in range(11):
    if i & 3 == 0:
        print(i)

print('Rango con valores de inicio = 2 y fin = 6')
rango = range (2,7)
for i in rango:
    print(i)