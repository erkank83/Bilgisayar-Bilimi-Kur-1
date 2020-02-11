#topla yardımcı fonksiyonu tanımlanır
def topla(x,y):
    toplam=x+y
    return toplam
#ana fonksiyon yazılır
sayi1=int(input("Birinci sayıyı giriniz :"))
sayi2=int(input("İkinci  sayıyı giriniz :"))
sonuc=topla(sayi1,sayi2)
print("{} + {} = {}".format(sayi1,sayi2,sonuc))
