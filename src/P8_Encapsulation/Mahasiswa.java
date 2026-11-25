package P8_Encapsulation;
//class kita nanti hanya bisa digunakan oleh kelas lain tetapi tidak bisa dirubah
public class Mahasiswa {
    private int npm;
    private String nama;
    
    public Mahasiswa(int npm, String nama){
        this.npm = npm;
        this.nama = nama;
    }

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void info(){
        System.out.println("NPM: " + npm);
        System.out.println("Nama: " + nama);
    }
}
