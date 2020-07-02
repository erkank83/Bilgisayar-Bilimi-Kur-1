import math

class Ucgen:

    Tur="Üçgen"
    
    def __init__(self,a=3,b=4,c=5):
        self.a=a
        self.b=b
        self.c=c

    def oku(self):
        self.a=float(input("a kenar uzunluğu :"))
        self.b=float(input("b kenar uzunluğu :"))
        self.c=float(input("c kenar uzunluğu :"))
        return Ucgen(self.a,self.b,self.c)
      
    def hangiTurUcgenim(self):
        return self.Tur
    
    def cevre(self):
        return self.a + self.b + self.c
        
    def alan(self):
        self.u=(self.a+self.b+self.c)/2
        self.alan=math.sqrt(self.u*(self.u-self.a)*(self.u-self.b)*(self.u-self.c))

        return math.ceil(self.alan)
      
    def ucgenOlusurMu(self):
        return ((abs(self.b-self.c)<self.a) and (self.a<self.b+self.c))\
            and((abs(self.a-self.c)<self.b) and (self.b<self.a+self.c))\
            and((abs(self.a-self.b)<self.c) and (self.c<self.a+self.b))

    def ucgenKontrol(self):
        ucgen=Ucgen()
        if self.ucgenOlusurMu():
            if self.a==self.b and self.b==self.c and self.a==self.c:
                ucgen= Eskenar(self.a,self.b,self.c)
            elif self.a==self.b or self.a==self.c or self.b==self.c:
                ucgen= Ikizkenar(self.a,self.b,self.c)
            elif self.a != self.b != self.c:
                ucgen= Cesitkenar(self.a,self.b,self.c)
        else:
            return False#üçgen oluşmaz

        return ucgen
    
    def __str__(self):
        return "Tür  : {}\nAlan : {}\nÇevre: {}".format(self.hangiTurUcgenim(),self.alan(),self.cevre())

    def __len__(self):
        return 1
    def __del__(self):
        return "Ucgen nesnesi silindi..."

class Ikizkenar(Ucgen):
    
    def __init__(self,a,b,c,Tur="İkizkenar üçgen"):
        #Ucgen.__init__(self,a,b,c)
        super().__init__(a,b,c)
        self.Tur=Tur
        
    #override
    def hangiTurUcgenim(self):
        return self.Tur
    
    def __str__(self):
        return "Tür  : {}\nAlan : {}\nÇevre: {}".format(self.hangiTurUcgenim(),self.alan(),self.cevre())

    
class Eskenar(Ucgen):
    
    def __init__(self,a,b,c,Tur="Eşkenar üçgen"):
        #Ucgen.__init__(self,a,b,c)
        super().__init__(a,b,c)
        self.Tur=Tur
        
    #override
    def hangiTurUcgenim(self):
        return self.Tur

    def __str__(self):
        return "Tür  : {}\nAlan : {}\nÇevre: {}".format(self.hangiTurUcgenim(),self.alan(),self.cevre())

class Cesitkenar(Ucgen):
    
    def __init__(self,a,b,c,Tur="Çeşit kenar üçgen"):
        super().__init__(a,b,c)
        self.Tur=Tur
        
    #override  
    def hangiTurUcgenim(self):
        return self.Tur

    def __str__(self):
        return "Tür  : {}\nAlan : {}\nÇevre: {}".format(self.hangiTurUcgenim(),self.alan(),self.cevre())
    
# ana fonksiyon
ucgen=Ucgen()
def oku():
    global ucgen
    ucgen=Ucgen().oku().ucgenKontrol()
    
def yaz():
    print(str(ucgen) if ucgen else "Üçgen oluşmaz...")

def ana():
    oku()
    yaz()
   
ana()
