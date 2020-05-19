#çözüm 1
paketCay=10
paketSayisi=int(input("Paket sayısını giriniz :"))
if paketSayisi>=10 and paketSayisi<50:
    indirim=0.05
elif paketSayisi>=50 and paketSayisi<100:
    indirim=0.10
else:
    indirim=0.15
toplam=paketCay*paketSayisi
kdv=toplam*0.08
satis=(toplam+kdv)-(toplam+kdv)*indirim
print("Toplam\t: {0}TL\nKDV\t: {1}TL\nİndirim\t:{2}TL\nSatış\t: {3}TL".format(toplam,kdv,-(toplam+kdv)*indirim,satis))
#çözüm 2
paketCay=10
paketSayisi=int(input("Paket sayısını giriniz :"))
if paketSayisi>=10 and paketSayisi<50:
    indirim=0.95
elif paketSayisi>=50 and paketSayisi<100:
    indirim=0.90
else:
    indirim=0.85
toplam=paketCay*paketSayisi
kdv=toplam*0.08
satis=(toplam+kdv)*indirim
print("Toplam\t: {0}TL\nKDV\t: {1}TL\nİndirim\t:-{2}TL\nSatış\t: {3}TL".format(toplam,kdv,(toplam+kdv)-satis,satis))

