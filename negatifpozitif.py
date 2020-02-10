negatif=0
pozitif=0
print("Çıkmak için 0 sayısına basınız!")
while True:
    sayi=float(input("Sayı giriniz :"))
    if sayi==0:
        break
    if sayi>0:
        pozitif=pozitif+1
    else:
        negatif=negatif+1
    print("Pozitif sayı: {}\nNegatif sayı: {}".format(pozitif,negatif))
