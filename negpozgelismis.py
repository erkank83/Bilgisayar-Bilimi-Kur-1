#global değişkenler tanımlanır
negatif=0
pozitif=0
sayi=0.0
def soru():
    # soruyu ekranda gösterir
    print("Klavyeden, 0 girilene kadar kaç adet negatif; kaç adet pozitif sayı girildiğini hesaplayan algoritma ve akış şemasını oluşturunuz.")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Hesapla\t: 0 girilene kadar kaç adet negatif; kaç adet pozitif sayı girildiğini hesaplar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (H)esapla||(Y)ardim||(Ç)ıkış =- :")
def altMenu():
    return print("Çıkmak için 0 sayısına basınız!")
def oku():
    try:
        global sayi
        sayi=float(input("Sayı giriniz :"))
        return sayi
    except ValueError:
        sayi=0.0
        print("Geçersiz veri")
def yaz():
    global negatif,pozitif
    if (negatif!=0 or pozitif!=0) and sayi!=0:
        print("Pozitif sayı: {}\nNegatif sayı: {}".format(pozitif,negatif))
def hesapla():
    global negatif,pozitif,sayi,durum2
    if sayi==0.0:
        durum2=True
    elif sayi>0:
         pozitif+=1
    else:
        negatif+=1

def main():
    durum1=False
    while not durum1:
        secim=menu()
        if secim=="H" or secim=="h":
            durum2=False
            while not durum2:
                altMenu()
                if oku()==0:
                    durum2=True
                else:
                    hesapla()
                    yaz()
        elif secim=="S" or secim=="s":
            soru()
        elif secim=="Y" or secim=="y":
            yardim()
        elif secim=="Ç" or secim=="ç":
            durum1=True
main() 
