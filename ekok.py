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
# enBuyukBul yardımcı fonksiyon tanımlanır    
def enBuyukBul(sayi1,sayi2):
    #eğer sayi1, sayi2'den büyükse aktar
    if sayi1>sayi2:
        sayi=sayi1
    #eğer sayi2, sayi1'den büyükse aktar    
    elif sayi2>sayi1:
        sayi=sayi2
    #eğer sayi1, sayi2'ye eşitse aktar
    else:
        sayi=sayi1
    return sayi
# ekok yardımcı fonksiyon tanımlanır
def ekok(sayi1,sayi2):
    ekok=1
    sayi=enBuyukBul(sayi1,sayi2)
    for i in range(2,sayi+1):
        if asalMi(i):
            while sayi1%i==0 or sayi2%i==0:
                print("{0:3}\t{1:3}\t| {2:3}".format(int(sayi1),int(sayi2),i))
                ekok=ekok*i
                if sayi2%i==0:
                    sayi2=sayi2/i
                if sayi1%i==0:
                    sayi1=sayi1/i
                if sayi1==1 and sayi2==1:
                    print("{0:3}\t{1:3}".format(int(sayi1),int(sayi2)))
    return ekok
# Ana fonksiyon tanımlanır
sayi1=abs(int(input("Birinci sayıyı giriniz :")))
sayi2=abs(int(input("İkinci  sayıyı giriniz :")))
ekok(sayi1,sayi2)

