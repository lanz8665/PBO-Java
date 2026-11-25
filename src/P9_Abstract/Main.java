package P9_Abstract;

public class Main {
    public static void main(String[] args) {       
        BangunDatar bd = new Persegi();
        bd.hitungLuas();
    }    
}
interface BangunDatar {
    //int p = 6;
    abstract void hitungLuas();
    abstract void hitungKeliling();
}
class Persegi implements BangunDatar{
    @Override
    public void hitungLuas() {
        int p = 4;
        int l = 12;
        int luas = p*l;
        System.out.println("Luas Persegi: " + luas);
    }

    @Override
    public void hitungKeliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


