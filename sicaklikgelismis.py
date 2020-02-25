#global değişkenler tanımlanır
sicaklik=0
durum=""
def soru():
    #ekranda soruyu ekranda gösterir
    print("Klavyeden, girilen sıcaklık derecesine göre suyun katı/sıvı/gaz hâllerinden hangisinde olduğunu yazan algoritma ve akış şemasını oluşturunuz.")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Hesapla\t: girilen sıcaklık derecesine göre suyun katı/sıvı/gaz hâllerinden hangisinde olduğunu yazar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (H)esapla||(Y)ardim||(Ç)ıkış =- :")
def oku():
    try:
        global sicaklik
        sicaklik=int(input("Bir tamsayı giriniz :"))
    except ValueError:
        sicaklik,durum=0,""
        print("Geçersiz veri")
def yaz():
    global sicaklik,durum
    if not(not sicaklik) and durum!="":
        #sicaklik değeri boş değilse yani değer girilmiş ise ve
        #durum değeri de boş değilse yani dolu ise
        print("Su, ",sicaklik,"°C'de ",durum," halinde bulunur.")
def hesapla():
    global sicaklik,durum
    if sicaklik<0:
        durum="katı"
    elif sicaklik==0:
        durum="katı ve sıvı"
    elif sicaklik>0 and sicaklik<100:
        durum="sıvı"
    elif sicaklik==100:
        durum="sıvı ve gaz"
    else:
        durum="gaz"
def main():
    durum=False
    while not durum:
        secim=menu()
        if secim.lower()=="h":
            oku()
            hesapla()
            yaz()
        elif secim.lower()=="s":
            soru()
        elif secim.lower()=="y":
            yardim()
        elif secim.lower()=="ç":
            durum=True
main()
    
    
