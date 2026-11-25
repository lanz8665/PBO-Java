package P5;

public class Employee {
    int nip;
    String nama;
    double gaji;

    public Employee(int nip, String nama, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public void info(){
        System.out.println("NIP " + nip);
        System.out.println("Nama " + nama);
        System.out.println("Gaji " + gaji);
    }
    
    
}
