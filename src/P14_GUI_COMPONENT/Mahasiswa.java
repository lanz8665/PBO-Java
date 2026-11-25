package P14_GUI_COMPONENT;

public class Mahasiswa {

    private String npm;
    private String nama;
    private String prodi;
    private String hobi;
    private String statusKelas;
    
    public Mahasiswa(String npm, String nama, String prodi, String statusKelas, String hobi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
        this.hobi = hobi;
        this.statusKelas = statusKelas;        
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public String getHobi() {
        return hobi;
    }

    public String getStatusKelas() {
        return statusKelas;
    }          
}
