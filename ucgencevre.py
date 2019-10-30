from math import sqrt

a=input("Kenar uzunluğu :")#klavyeden kenar uzunluğu giriliyor
h=input("Yükseklik      :")#klavyeden yükseklik giriliyor
a=int(a)                   #str tipi int tipine dönüşüyor
h=int(h)                   #str tipi int tipine dönüşüyor
b=sqrt(a**2+h**2)          #a^2=b^2+c^2
b=int(b)
cevre=a+b+h                #tüm kenarlar toplanır
print("Çevre :",a,"+",h,"+",b,"=",cevre)
