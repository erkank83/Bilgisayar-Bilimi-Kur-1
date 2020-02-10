toplam=0
ilk=int(input("İlk değeri giriniz: "))
son=int(input("Son değeri giriniz: "))
for i in range(ilk,son):
    toplam=toplam+i
print("{} ile {} arasındaki sayıların toplamı {}".format(ilk,son,toplam))
