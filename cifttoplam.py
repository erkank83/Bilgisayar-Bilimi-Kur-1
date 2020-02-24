#global değişkenler tanımlanır
ciftToplam=0
sayi=0
def soru():
    #ekranda soruyu ekranda gösterir
    print("Klavyeden, girilen sayıya kadar olan sayıların çift olanlarının toplamını hesaplayan ve yazdıran algoritma ve akış şemasını yazınız.")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Hesapla\t: Ortalama ve devamsızlık bilgisine göre geçme/kalma durumunu hesaplar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (H)esapla||(Y)ardim||(Ç)ıkış =- :")
def oku():
    try:
        global sayi
        sayi=int(input("Bir tamsayı giriniz :"))
    except ValueError:
        sayi=0
        print("Geçersiz veri")
def yaz():
    global sayi,ciftToplam
    if sayi!=0:
        print("Çift toplam:{0}".format(ciftToplam))
        sayi,ciftToplam=0,0
def hesapla():
    global sayi,ciftToplam
    for i in range(sayi):
        if i%2==0:
            ciftToplam=ciftToplam+i
def main():
    durum=False
    while not durum:
        secim=menu()
        if secim=="H" or secim=="h":
            oku()
            hesapla()
            yaz()
        elif secim=="S" or secim=="s":
            soru()
        elif secim=="Y" or secim=="y":
            yardim()
        elif secim=="Ç" or secim=="ç":
            durum=True
main()
