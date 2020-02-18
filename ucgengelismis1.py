import math
# ucgenOlusurMu yardımcı fonksiyonu
def ucgenOlusurMu(a,b,c):
    sart1=(abs(b-c)<a) and (a<b+c)
    sart2=(abs(a-c)<b) and (b<a+c)
    sart3=(abs(a-b)<c) and (c<a+b)
    if sart1 and sart2 and sart3:
        return True
    else:
        return False
# ucgenTuru yardımcı fonksiyonu
def ucgenTuru(a,b,c):
    if a==b and b==c and a==c:
        mesaj="Eşkenar üçgen"
    elif a==b or a==c or b==c:
        mesaj="İkizkenar üçgen"
    else:
        mesaj="Çeşit kenar üçgen"
    return mesaj
# ucgenCevre yardımcı fonksiyonu
def ucgenCevre(a,b,c):
    cevre=a+b+c
    return cevre
# ucgenAlan yardımcı fonksiyonu
def ucgenAlan(a,b,c):
    u=(a+b+c)/2
    alan=math.sqrt(u*(u-a)*(u-b)*(u-c))
    return math.ceil(alan)
# Ana fonksiyon tanımlanır
a=float(input("a kenar uzunluğu :"))
b=float(input("b kenar uzunluğu :"))
c=float(input("c kenar uzunluğu :"))
kontrol=ucgenOlusurMu(a,b,c)
if kontrol==True:
    print("Üçgen oluşturur")
    ucgenTuruGelenSonuc=ucgenTuru(a,b,c)
    print("Üçgen Türü: {}".format(ucgenTuruGelenSonuc))
    ucgenCevreGelenSonuc=ucgenCevre(a,b,c)
    print("Üçgenin Çevresi: {}".format(ucgenCevreGelenSonuc))
    ucgenAlanGelenSonuc=ucgenAlan(a,b,c)
    print("Üçgenin Alanı : {}".format(ucgenAlanGelenSonuc))
else:
    print("Üçgen oluşturmaz")
    









    

