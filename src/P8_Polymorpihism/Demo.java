package P8_Polymorpihism;
//Polymorpism = nama methodenya sama, tapi kita melakukan hal yang berbeda dari tiap methode nya

class Hewan{
    void bersuara(){
        System.out.println("Hewan Bersuara");
    }
}

class Anjing extends Hewan{
    void bersuara(){
        System.out.println("guk guk !!");
    }
}

class Kucing extends Hewan{
    void bersuara(){
        System.out.println("meong meong..");
    }
}

public class Demo {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        h.bersuara();
        
        Hewan k = new Kucing();
        k.bersuara();
        
        Hewan a = new Anjing();
        a.bersuara();
    }
}
