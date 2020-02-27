#global değişkenler tanımlanır
a,b,c=0.0,0.0,0.0
sart1,sart2,sart3=False,False,False
def soru():
    #ekranda soruyu ekranda gösterir
    print("Klavyeden, uzunlukları girilen üç doğru parçasının bir üçgen oluşturup oluşturamayacağını hesaplayan algoritma ve akış şemasını oluşturunuz. (Bir üçgenin iki kenarının uzunluğu toplamı, üçüncü kenardan büyük olmalıdır.)")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Hesapla\t: Uzunlukları girilen üç doğru parçasının bir üçgen oluşturup oluşturamayacağını hesaplar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (H)esapla||(Y)ardim||(Ç)ıkış =- :")
def oku():
    try:
        global a,b,c
        a=float(input("a kenar uzunluğu :"))
        b=float(input("b kenar uzunluğu :"))
        c=float(input("c kenar uzunluğu :"))
    except ValueError:
        a,b,c=0.0,0.0,0.0
        print("Geçersiz veri")
        
def hesapla():
    global a,b,c,sart1,sart2,sart3
    sart1=(abs(b-c)<a)and(a<b+c)
    sart2=(abs(a-c)<b)and(b<a+c)
    sart3=(abs(a-b)<c)and(c<a+b)
    
def yaz():
    global sart1,sart2,sart3
    if a!=0.0 and b!=0.0 and c!=0.0:
        print("Üçgen oluşur" if sart1 and sart2 and sart3 else "Üçgen oluşmaz")
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
