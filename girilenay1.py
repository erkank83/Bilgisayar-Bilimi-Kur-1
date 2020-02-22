ay=" "
mevsim=" "
def soru():
    #ekranda soruyu ekranda gösterir
    print("Klavyeden, girilen ay bilgisine göre kuzey yarım kürede hangi mevsimin yaşandığını ekrana yazdıran algoritma akış şemasını oluşturunuz.")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("1. Çözüm: Ay bilgisi için sayı olarak girdi alır")
    print("2. Çözüm: Ay bilgisi için ay adını girdi alır")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
    
def menu():
    return input("-=(S)oru (1).Çözüm||(2).çözüm||(Y)ardim||(Ç)ıkış =- :")

def cozum1():
        global ay,mevsim
        if ay==12 or ay==1 or ay==2:
            mevsim="Kış"
        elif ay==3 or ay==4 or ay==5:
            mevsim="İlkbahar"
        elif ay==6 or ay==7 or ay==8:
            mevsim="Yaz"
        elif ay==9 or ay==10 or ay==11:
            mevsim="Sonbahar"
    
def cozum2():
    global ay,mevsim
    if ay.lower()=="aralık" or ay.lower()=="ocak" or ay.lower()=="şubat":
        mevsim="Kış"
    elif ay.lower()=="mart" or ay.lower()=="nisan" or ay.lower()=="mayıs":
        mevsim="İlkbahar"
    elif ay.lower()=="haziran" or ay.lower()=="temmuz" or ay.lower()=="ağustos":
        mevsim="Yaz"
    elif ay.lower()=="eylül" or ay.lower()=="ekim" or ay.lower()=="kasım":
        mevsim="Sonbahar"
    else:
        print("Geçerli bir ay ismi giriniz!")
        ay=" "
        
def arasindaMi(ilk,son):
    deger=int(input("{} ile {} arasında bir değer giriniz :  ".format(ilk,son)))
    while deger < ilk or deger > son:
        deger=int(input("Tekrar deneyin!:"))
    return deger
def sayiVerisiOku():
    try:
        global ay
        ay=arasindaMi(1,12)
    except ValueError:
        print("Geçersiz veri (1-12 arasında sayı olmalı)")
def metinVerisiOku():
    try:
        global ay
        ay=input("Ay adı giriniz:")
    except ValueError:
        print("Geçersiz veri")
        ay=" "
def yaz():
    global ay,mevsim
    if ay!=" ":
        print("Ay\t: {}\nMevsim\t: {}".format(ay,mevsim))
        ay=" "
def main():
    durum=False
    while not durum:
        
        secim=menu()
        if secim=="1":
            sayiVerisiOku()
            cozum1()
            yaz()
        elif secim=="2":
            metinVerisiOku()
            cozum2()
            yaz()
        elif secim=="S" or secim=="s":
            soru()
        elif secim=="Y" or secim=="y":
            yardim()
        elif secim=="Ç" or secim=="ç":
            durum=True
main()
