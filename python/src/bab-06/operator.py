print('Operator Aritmetika')
print(21+22) # 43
print(34-14) # 20
print(2*3) # 6
print(21/2) # 10.5
print(21.00/2.00) # 10.5
print(21%2) # 1
print(21.00//2.00) # 10.0
print(4**3) # 4 pangkat 3
print('Operator Relasional / Perbandingan')
print(3>22) # False
print(3<22) # True
print(4<=4) # True
print(4>=4) # True
print(5==5.0) # True
print(1!=1.0) # False
print('Operator Bitwise')
x = 25 # nilai awal
# 25 = 0001 1001
print(x >> 2) # 0000 0110 = 6
print(x << 2) # 0001 1000 = 24
a = 3 # 0000 0011
b = 6 # 0000 0110
# AND
print (a & b) # jika bit di dua operand sama, diaktifkan di hasil
              # 0000 0010 = 2
# OR
print (a | b) # jika bit ada di salah satu atau kedua operand, 
              # diaktifkan di hasil:
              # 0000 0111 = 7
# XOR
print (a ^ b) # jika bit ada di salah satu operand tapi tdk di keduanya,
              # diaktifkan di hasil:
              # 0000 0101 = 5
# Negasi / Not
print (-a) 
print('Operator Penugasan / Assignment')
x = 50
print(x) # 50
x+=5
print(x) # x = x lama + 5 = 50 + 5 =  55
x-=2
print(x) # x = x lama - 2 = 55 - 2 = 53
x*=2
print(x) # x = x lama * 2 = 53 * 2 = 106
x/=2
print(x) # x = x lama / 2 = 106 / 2 = 53
x%=3
print(x) # x = x lama modulo 3 = 53 modulo 3 = 2.0 
         # (karena pembagian terakhir berhenti di 51)
x = 55
x//=2
print(x) # x = x lama / 2, hasil dibulatkan ke bawah = 27.5
         # dibulatkan 27
x**=2
print(x) # x = x lama pangkat 2 = 27 pangkat 2 = 729
x = 7
x&=2
print(x) 
x|=2
print(x)
x^=2
print(x)
x>>=2
print(x)
x<<=2
print(x)

print('Operator Logika')

print('Operator Keanggotaan / Membership')

print('Operator Identitas / Identity')

