satir = 0
yukseklik = 5
while satir < yukseklik:
    sayac = 0
    while sayac < yukseklik - satir:
        print(end=" ")
        sayac += 1
    sayac = 0
    while sayac < 2*satir + 1:
        print(end="*")
        sayac += 1
    print()
    satir += 1
