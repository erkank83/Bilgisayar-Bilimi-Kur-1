#global değişkenler tanımlanır
pi=3.141592653589793
yariCap=0.0
alan=0.0
cevre=0.0

def soru():
    #ekranda soruyu ekranda gösterir
    print("Klavyeden, bir daireye ait yarı çapı girişi yapıldıktan sonra ekrana dairenin alanını ve çevresini hesaplayan programın kodlarını oluşturunuz.")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Alan\t: Yarıçapı girilen dairenin alanını hesaplar")
    print("Cevre\t: Yarıçapı girilen dairenin çevresini hesaplar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (A)lan||(C)evre||(Y)ardim||(Ç)ıkış =- :")
def daireAlani():
    global alan
    alan=pi*pow(yariCap,2)
def daireCevre():
    global cevre
    cevre= 2*pi*yariCap
def veriOku():
    try:
        global yariCap
        yariCap=float(input("yarı çapı giriniz :"))
    except ValueError:
        yariCap=0.0
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
            daireAlani()
            yaz("Daireni alanı\t: {}".format(round(alan,3)))
            alan=0.0
        elif secim=="C" or secim=="c":
            veriOku()
            daireCevre()
            yaz("Daireni çevresi\t: {}".format(round(cevre,3)))
            cevre=0.0
        elif secim=="S" or secim=="s":
            soru()
        elif secim=="Y" or secim=="y":
            yardim()
        elif secim=="Ç" or secim=="ç":
            durum=True
main()
