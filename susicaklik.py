sicaklik=int(input("Suyun sıcaklığını giriniz :"))
if sicaklik<0:
    durum="katı"
elif sicaklik==0:
    durum="katı ve sıvı"
elif sicaklik>0 and sicaklik<100:
    durum="sıvı"
elif sicaklik==100:
    durum="sıvı ve gaz"
else:
    durum="gaz"
print("Su, ",sicaklik,"°C'de ",durum," halinde bulunur.")

