package P3;

public class Lingkaran {
    
    //attribute
    double jari;
    double luas;
    double keliling;
    final double PHI = 3.14;    
    //method
    double hitungLuas(){
        luas = PHI * jari * jari;
        return luas;
    }
    double hitungKeliling(){
        keliling = PHI * jari * 2;
        return keliling;
    }    
}
