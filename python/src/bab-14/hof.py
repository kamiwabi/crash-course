# hof.py (higher order function)

# HOF - fungsi sebagai argumen fungsi
def penjumlahan(angka):
    return sum(angka)

def aksi(func, angka2):
    return func(angka2)

print(aksi(penjumlahan, [1, 2, 3, 4, 5]))

# HOF - fungsi sebagai return value
def p1():
    return "remaja"
def p2():
    return "dewasa"

def person():
    umur = int(input("Umur anda: "))

    if umur <= 21:
        return p1()
    else:
        return p2()

print(person())
