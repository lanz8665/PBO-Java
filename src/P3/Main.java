package P3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //instantiation
        //namaKelas namaObjek = new Constructor();
        Scanner in = new Scanner(System.in);
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.print("Masukan Jari: ");
        lingkaran1.jari = in.nextDouble();
        System.out.println("Luas Lingkaran = " 
                + lingkaran1.hitungLuas());
        
        Lingkaran l2 = new Lingkaran();
        l2.jari = 9;
        System.out.println("Luas L2 = " +
                l2.hitungLuas());
    }
    
}
