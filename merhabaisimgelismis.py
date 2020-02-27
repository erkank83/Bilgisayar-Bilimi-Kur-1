#global değişkenler tanımlanır
ad=""
def soru():
    #ekranda soruyu ekranda gösterir
    print("Klavyeden ismini giren kişiyi “Merhaba ‘İsim’ ” şeklinde selamlayan algoritma ve akış şemasını oluşturunuz. Kodunu oluşturunuz")
def yardim():
    # menünün açıklamasının yapıldığı ekranı gösterir
    print("Soru\t: Soru metnini görütüler")
    print("Hesapla\t: Merhaba ‘İsim’ yazar")
    print("Yardım\t: Bu ekranı görüntüler")
    print("Çıkış\t: Programdan çıkışı sağlar")
def menu():
    return input("-=(S)oru (H)esapla||(Y)ardim||(Ç)ıkış =- :")
def oku():
    try:
        global ad
        ad=input("İsminizi giriniz: ")
        ad=ad.strip()#sağdan ve soldan boşlukları temizler
    except ValueError:
        ad=""#büyük ihtimalle bu koda girilmeyecek
        print("Geçersiz veri")
def yaz():
    global ad
    if not(not ad):
        print("Merhaba '"+ad.capitalize()+"'")
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
