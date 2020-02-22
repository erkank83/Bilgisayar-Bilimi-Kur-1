#matematik işlemleri için kütüphane eklenir
import math
#global değişkenler tanımlanır
a=0.0
h=0.0
b=0.0
alan=0.0
cevre=0.0
def soru():
    #ekranda soruyu ekranda gösterir
    print("Klavyeden, bir üçgene ait kenar uzunluğu ve o kenarın yükseklik bilgisinin girişi yapıldıktan sonra ekrana üçgenin alanını ve çevresini hesaplayan programın kodlarını oluşturunuz.")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Alan\t: Dik üçgenin alanını hesaplar")
    print("Cevre\t: Dik üçgenin çevresini hesaplar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (A)lan||(C)evre||(Y)ardim||(Ç)ıkış =- :")
def ucgenAlan():
    global a,h,alan
    alan=(a*h)/2
def ucgenCevre():
    global a,h,b,cevre
    b=math.sqrt(pow(a,2)+pow(h,2))
    cevre=a+h+b
def veriOku():
    try:
        global a,h
        a=float(input("Kenar uzunluğu :"))
        h=float(input("Yükseklik      :"))
    except ValueError:
        a,h=0.0,0.0
        print("Geçeriz veri girişi")
def yaz(deger):
    if alan!=0.0 or cevre!=0.0:
        print(deger)
def main():
    durum=False
    while not durum:
        global alan,cevre
        secim=menu()
        if secim=="A" or secim =="a":
            veriOku()
            ucgenAlan()
            yaz("Dik üçgenin alanı : {}".format(round(alan,3)))
            alan=0.0
        elif secim=="C" or secim =="c":
            veriOku()
            ucgenCevre()
            yaz("Dik üçgenin çevresi : {}".format(round(cevre,3)))
            cevre=0.0
        elif secim=="S" or secim=="s":
            soru()
        elif secim=="Y" or secim=="y":
            yardim()
        elif secim=="Ç" or secim=="ç":
            durum=True
main()       
