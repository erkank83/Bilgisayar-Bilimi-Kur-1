class Daire:
    pi=3.141592653589793
    hata=False

    def __init__(self,yariCap=1):
        self.yariCap=yariCap

    def hesaplaCevre(self):
        return 2*self.pi*self.yariCap

    def hesaplaAlan(self):
        return self.pi*self.yariCap**2

    def oku(self):
        try:
            yariCap=input("yarı çapı giriniz :").strip()
            if yariCap.isdigit():
                self.yariCap=int(yariCap)
            elif yariCap.isalpha():
                print("Harf yerine sayı giriniz!!")
                self.hata=True
            elif yariCap.index("."):
                self.yariCap=float(yariCap)
        except:
            self.yariCap=float(yariCap.replace(",", "."))
            
    def yaz(self):
        if not self.hata:
            print("Alan :{a:1.3f} - Çevre :{c:1.3f}".format(a=self.hesaplaAlan(),c=self.hesaplaCevre()))
#örnek 1
c1= Daire()
c1.yaz()
#örnek 2
c2= Daire()
c2.oku()
c2.yaz() 
