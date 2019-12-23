sayi=int(input("Bir sayı giriniz :"))
#çözüm 1
if sayi%3==0 and sayi%10==0:
    mesaj= str(sayi)+", 3'e ve 10'a bölünebilir."
else:
    mesaj= str(sayi)+", 3'e ve 10'a bölünemez"
print(mesaj)
#çözüm 2
print(sayi," sayısı",(", 3'e ve 10'a bölünebilir."
if sayi%3==0 and sayi%10==0 else " 3'e ve 10'a bölünemez"))
