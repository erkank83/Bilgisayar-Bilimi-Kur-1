a=float(input("a kenar uzunluğu :"))
b=float(input("b kenar uzunluğu :"))
c=float(input("c kenar uzunluğu :"))
sart1=(abs(b-c)<a)and(a<b+c)
sart2=(abs(a-c)<b)and(b<a+c)
sart3=(abs(a-b)<c)and(c<a+b)
# Yazım 1
print("(1)Üçgen oluşur" if sart1 and sart2 and sart3 else "(1)Üçgen oluşmaz")
# Yazım 2
if sart1 and sart2 and sart3:
    print("(2)Üçgen Oluşur.")
else:
    print("(2)Üçgen Oluşmaz.")
