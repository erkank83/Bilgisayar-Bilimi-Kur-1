import math
a=float(input("a kenar uzunluğu :"))
b=float(input("b kenar uzunluğu :"))
c=float(input("c kenar uzunluğu :"))
sart1=(abs(b-c)<a)and(a<b+c)
sart2=(abs(a-c)<b)and(b<a+c)
sart3=(abs(a-b)<c)and(c<a+b)
#Üçgen oluşur mu
if sart1 and sart2 and sart3:
    print("Üçgen oluşturur")
    #Üçgen türü belirleme
    if a==b and b==c and a==c:
        mesaj="Eşkenar üçgen"
    elif a==b or a==c or b==c:
        mesaj="İkizkenar üçgen"
    else:
        mesaj="Çeşit kenar üçgen"
    print("Üçgen Türü :",mesaj)
    #Üçgen çevresi belirleme
    print("Üçgenin çevresi : ",a+b+c)
    #Üçgen Alanını belirleme
    u=(a+b+c)/2
    alan=math.sqrt(u*(u-a)*(u-b)*(u-c))
    print("Üçgenin alanı :",round(alan,0))
else:
    print("Üçgen oluşturmaz")
