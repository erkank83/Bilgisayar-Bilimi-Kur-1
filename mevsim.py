ay=int(input("Bir ay sayısı giriniz :"))
if ay==12 or ay==1 or ay==2:
    mevsim="Kış"
elif ay==3 or ay==4 or ay==5:
    mevsim="İlkbahar"
elif ay==6 or ay==7 or ay==8:
    mevsim="Yaz"
elif ay==9 or ay==10 or ay==11:
    mevsim="Sonbahar"
else:
    print("Lütfen 1-12 arasında değer girin!")
print("Girilen ay "+str(ay)+", mevsim ise "+mevsim if ay>=1 and ay<=12 else "Hata var")
