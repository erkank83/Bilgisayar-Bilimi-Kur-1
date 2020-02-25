#global değişkenler tanımlanır
sayac=0
isim=" "
def soru():
    # soruyu ekranda gösterir
    print("Klavyeden, X karakteri girilene kadar girilen isimlere kaçıncı kişi olduğunu yazan algoritma ve akış şemasını oluşturunuz.")

def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Hesapla\t: X karakteri girilene kadar girilen isimlere kaçıncı kişi olduğunu yazar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")

def menu():
    return input("-=(S)oru (H)esapla||(Y)ardim||(Ç)ıkış =- :")

def altMenu():
    return print("Çıkmak için x|X karakterine basınız!")

def oku():
    try:
        global isim
        isim=input("İsim giriniz :")
        return isim
    except ValueError:
        isim=""
        print("Geçersiz veri")

def yaz():
    global sayac,isim
    print("{}, {}. kişisiniz".format(isim,sayac))

def hesapla():
    global sayac
    sayac+=1

def main():
    durum1=False
    while not durum1:
        secim=menu()
        if secim=="H" or secim=="h":
            durum2=False
            global sayac
            while not durum2:
                altMenu()
                if oku().lower()=="x":
                    # x karakterini her zaman küçük harfe çevir
                    durum2=True
                    sayac=0
                elif not(not isim):
                    # eğer isim boş değilse hem sayacı arttır hem de yazdır
                    hesapla()
                    yaz()
        elif secim=="S" or secim=="s":
            soru()
        elif secim=="Y" or secim=="y":
            yardim()
        elif secim=="Ç" or secim=="ç":
            durum1=True
main() 
