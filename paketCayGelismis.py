#global değişkenler tanımlanır
paketCay=10
paketSayisi=0
indirim=0
toplam=0
kdv=0
satis=0
def soru():
    #ekranda soruyu ekranda gösterir
    print("Bir marketteki bir paket çayın fiyatı 10 TL’dir. Müşteri 10 ile 49 arasında paket aldığında %5, 50 - 99 adet arası paket aldığında %10; 100 üzeri paket aldığında %15 indirim uygulanmaktadır. Faturaya uygulanacak KDV %8’dir. Müşterinin aldığı paket sayısına göre ödeyeceği ücreti hesaplayan algoritma ve akış şemasını yazınız.")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Hesapla\t: Müşterinin aldığı paket sayısına göre ödeyeceği ücreti hesaplar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (H)esapla||(Y)ardim||(Ç)ıkış =- :")

def ondanBuyukMu():
    deger=int(input("Paket sayısını giriniz :"))
    while deger < 10:
        deger=int(input("Tekrar deneyin!:"))
    return deger

def oku():
    try:
        global paketSayisi
        paketSayisi=ondanBuyukMu()
    except ValueError:
        print("Geçersiz veri")
        paketSayisi,indirim,toplam,kdv,satis=0,0,0,0,0
def hesaplaIndirim():
    global paketSayisi,indirim
    if paketSayisi>=10 and paketSayisi<50:
        indirim=0.05
    elif paketSayisi>=50 and paketSayisi<100:
        indirim=0.10
    else:
        indirim=0.15
def hesaplaSatis():
    global paketCay,paketSayisi,toplam,kdv,satis
    toplam=paketCay*paketSayisi
    kdv=toplam*0.08
    satis=(toplam+kdv)-(toplam+kdv)*indirim
def yaz():
    global toplam,kdv,indirim,satis
    if satis!=0:
        print("Toplam\t: {0}TL\nKDV\t: {1}TL\nİndirim\t:{2}TL\nSatış\t: {3}TL".format(toplam,kdv,-(toplam+kdv)*indirim,satis))
def main():
    durum=False
    while not durum:
        secim=menu()
        if secim.lower()=="h":
            oku()
            hesaplaIndirim()
            hesaplaSatis()
            yaz()
        elif secim.lower()=="s":
            soru()
        elif secim.lower()=="y":
            yardim()
        elif secim.lower()=="ç":
            durum=True
main()
