#global değişkenler tanımlanır
ortalama=0.0
devamsizlik=0.0
def soru():
    #ekranda soruyu ekranda gösterir
    print("Bir öğrencinin ortalama ve devamsızlık bilgisine göre geçme/kalma durumunu kontrol ediniz ve ekrana yazdıran algoritma akış şemasını oluşturunuz..")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Hesapla\t: Ortalama ve devamsızlık bilgisine göre geçme/kalma durumunu hesaplar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (H)esapla||(Y)ardim||(Ç)ıkış =- :")

def arasindaMi(baslik,ilk,son):
    deger=float(input("{} {} ile {} arasında bir değer giriniz :  ".format(baslik,ilk,son)))
    while deger < ilk or deger > son:
        deger=float(input("Tekrar deneyin!:"))
    return deger
def oku():
    try:
        global ortalama,devamsizlik
        ortalama=arasindaMi("Ortalama için, ",0,100)
        devamsizlik=arasindaMi("Devamsizlik için, ",0,30)
    except ValueError:
        ortalama,devamsizlik=0.0,0.0
        print("Geçersiz veri")

def yaz():
    global ortalama,devamsizlik
    if ortalama!=0.0 or devamsizlik!=0:
        print("Geçti" if ortalama>=50 and devamsizlik<10 else "Kaldı" )
        ortalama,devamsizlik=0.0,0.0
def main():
    durum=False
    while not durum:
        secim=menu()
        if secim=="H" or secim=="h":
            oku()
            yaz()
        elif secim=="S" or secim=="s":
            soru()
        elif secim=="Y" or secim=="y":
            yardim()
        elif secim=="Ç" or secim=="ç":
            durum=True
main()
