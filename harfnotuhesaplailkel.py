puan=float(input("0 ile 100 arasında bir sayı giriniz :"))
#pozitif mantık 1
if puan>=90:
    notum="A"
elif puan>=80:
    notum="B"
elif puan>=70:
    notum="C"
elif puan>=60:
    notum="D"
else:
    notum="F"
print("Pozitif Mantık 1 çözüm :",notum)
#negatif mantık 1
if not(puan<90):
    notum="A"
elif not(puan<80):
    notum="B"
elif not(puan<70):
    notum="C"
elif not(puan<60):
    notum="D"
else:
    notum="F"
print("Negatif Mantık 1 çözüm :",notum)
#pozitif mantık 2
if puan<60:
    notum="F"
elif puan<70:
    notum="D"
elif puan<80:
    notum="C"
elif puan<90:
    notum="B"
else:
    notum="A"
print("Pozitif Mantık 2 çözüm :",notum)
#negatif mantık 2
if not(puan>=60):
    notum="F"
elif not(puan>=70):
    notum="D"
elif not(puan>=80):
    notum="C"
elif not(puan>=90):
    notum="B"
else:
    notum="A"
print("Negatif Mantık 2 çözüm :",notum)
    









    






