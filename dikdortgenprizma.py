#hesaplaHacim yardımcı fonksiyon
def hesaplaHacim(a,b,c):
    hacim = a*b*c
    return hacim
#hesaplaYuzeyAlan yardımcı fonksiyon
def hesaplaYuzeyAlan(a,b,c):
    alan = 2*(a*b+a*c+b*c)
    return alan
#Ana fonksiyon tanımlanır
a=float(input("a kenar uzunluğu :"))
b=float(input("b kenar uzunluğu :"))
c=float(input("c kenar uzunluğu :"))
alan=hesaplaYuzeyAlan(a,b,c)
hacim=hesaplaHacim(a,b,c)
print("A = 2 .( ab + ac +bc)")
print("A = {}".format(round(alan,2)))
print("V = a.b.c ")
print("V = {}".format(round(hacim,2)))
