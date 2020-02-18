# pozitif mantık 1 yardımcı fonksiyonu
def pozitifMantik1(Not):
    if Not>=90:
        notum="A"
    elif Not>=80:
        notum="B"
    elif Not>=70:
        notum="C"
    elif Not>=60:
        notum="D"
    else:
        notum="F"
    return notum
#negatif mantık 1 yardımcı fonksiyonu
def negatifMantik1(Not):
    if not Not<90:
        notum="A"
    elif not Not<80:
        notum="B"
    elif not Not<70:
        notum="C"
    elif not Not<60:
        notum="D"
    else:
        notum="F"
    return notum
#pozitif mantık 2 yardımcı fonksiyon
def pozitifMantik2(Not):
    if Not<60:
        notum="F"
    elif Not<70:
        notum="D"
    elif Not<80:
        notum="C"
    elif Not<90:
        notum="B"
    else:
        notum="A"
    return notum
#negatif mantık 2 yardımcı fonksiyon
def negatifMantik2(Not):
    if not Not>=60:
        notum="F"
    elif not Not>=70:
        notum="D"
    elif not Not>=80:
        notum="C"
    elif not Not>=90:
        notum="B"
    else:
        notum="A"
    return notum
# Ana fonksiyon tanımlanır
Not=int(input("0 ile 100 arasında bir sayı giriniz :"))
mesaj1=pozitifMantik1(Not)
mesaj2=pozitifMantik2(Not)
mesaj3=negatifMantik1(Not)
mesaj4=negatifMantik2(Not)
print("{}\n{}\n{}\n{}".format(mesaj1,mesaj2,mesaj3,mesaj4))
