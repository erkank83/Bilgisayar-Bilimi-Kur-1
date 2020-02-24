#global değişkenler tanımlanır
toplam=0
ilk=0
son=0
def soru():
    #ekranda soruyu ekranda gösterir
    print("Girilen iki değer arasındaki sayıların toplamını bulan ve ekrana yazdıran algoritma ve akış şemasını oluşturunuz.")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Hesapla\t: İki değer arasındaki sayıların toplamını bulur")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (H)esapla||(Y)ardim||(Ç)ıkış =- :")

def hesapla():
    global toplam,ilk,son
    for i in range(ilk,son):
        toplam=toplam+i
    
def oku():
    try:
        global ilk,son
        ilk=int(input("İlk değeri giriniz: "))
        son=int(input("Son değeri giriniz: "))
    except ValueError:
        ilk,son=0,0
        print("Geçersiz veri")
def yaz():
    global ilk,son,toplam
    if ilk!=0 or son!=0:
          print("{} ile {} arasındaki sayıların toplamı {}".format(ilk,son,toplam))
          ilk,son=0,0
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
