# asalMi yardımcı fonksiyon tanımlanır
def asalMi(n):
    sayac=0
    for i in range(1,n):
        if n%i==0:
            sayac+=1
    if sayac==1:
        return True
    else:
        return False
# ana fonksiyon tanımlanır
sayi=int(input("Bir sayı giriniz: "))
dogruMu=asalMi(sayi)
print("Asal sayı" if dogruMu==True else "Asal sayı değil")
    
