ciftToplam=0
sayi=int(input("Bir tamsayı giriniz :"))
for i in range(sayi):
    if i%2==0:
        ciftToplam=ciftToplam+i
print("Çift toplam:{0}".format(ciftToplam))
