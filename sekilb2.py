#çözüm 1
print("Çözüm 1")
for satir in range(5):
    for sutun in range(satir+1):
        print("*",end="")
    print()
#çözüm 2
print("Çözüm 2")
sekil="* "
yeniSekil=""
for satir in range(5):
    for sutun in range(satir+1):
        yeniSekil+=sekil
    print("{0:^10}".format(yeniSekil))
    yeniSekil=""



