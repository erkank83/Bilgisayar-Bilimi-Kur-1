sayac=0
print("Çıkmak için x|X karakterine basınız!")
while True:
    isim=input("İsim giriniz :")
    if isim=="x" or isim=="X":
        break
    sayac=sayac+1
    print("{}, {}. kişisiniz".format(isim,sayac))
