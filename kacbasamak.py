#basamakBul yardımcı fonksiyon
def basamakBul(sayi):
    basamak=0
    if sayi==0:
        return 1
    while int(abs(sayi))>0:
        sayi=sayi/10
        basamak=basamak+1
    return basamak
#ana fonksiyon
sayi=int(input("Bir sayı giriniz :"))
sonuc=basamakBul(sayi)
print("{0} sayısı {1} basamaklıdır.".format(sayi,sonuc))
