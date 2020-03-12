#çözüm 1
print("Çözüm 1")
for satir in range(5):
    print("**********")
#çözüm 2
print("Çözüm 2")
sekil="*"
yeniSekil=""
for satir in range(5):
    for sutun in range(10):
        yeniSekil+=sekil
    print(yeniSekil)
    yeniSekil=""
