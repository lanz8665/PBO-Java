package P4;

public class Main {
    public static void main(String[] args) {           
        Mahasiswa m1 = new Mahasiswa(123, "Budi", "T. Informatika");
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa(321);
        Mahasiswa m4 = new Mahasiswa(322, "Tini");
        
    }    
}  
class Mahasiswa{
    
    int npm;
    String nama;
    String prodi;  
    
    public Mahasiswa(){
       this(0, null, null);
    }
    public Mahasiswa(int npm){
       this(npm, null, null);
    }
    public Mahasiswa(int npm, String nama){
       this(npm, nama, null);
    }    
    public Mahasiswa(int npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    
    
    
    public int penjumlahan(int angka1, int angka2){
        int hasil = angka1 + angka2;
        return hasil;
    
    }
    public double penjumlahan1(double angka1, double angka2){
        double hasil = angka1 + angka2;
        return hasil;
    
    }

    public double penjumlahan2(double angka1, int angka2){
        double hasil = angka1 + angka2;
        return hasil;
    
    }
    public double penjumlahan(int angka1, double angka2){
        double hasil = angka1 + angka2;
        return hasil;
    
    }    

    public int penjumlahan(int angka){    
        int hasil = angka + 10;
        return hasil;
    }

    public double penjumlahan(double a){    
        double hasil = a - 10;
        return hasil;
    }    
    
    
    void setData(int npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void infoMahasiswa(){
        //local variable
        System.out.println("NPM     : " + this.npm);
        System.out.println("Nama    : " + this.nama);
        System.out.println("Prodi   : " + this.prodi);
    }
                
   //methode 
}