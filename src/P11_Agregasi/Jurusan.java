package P11_Agregasi;
public class Jurusan {
    
    private String kode, namaJurusan;
    private Mahasiswa[] daftar = new Mahasiswa[10];
    private int jml;
    
    public Jurusan(String kode, String namaJurusan){
        this.kode = kode;
        this.namaJurusan = namaJurusan;
    }
    
    public void addMhs(Mahasiswa mhs){
        if(jml < daftar.length){
            this.daftar[jml] = mhs;
            this.jml++;        
        }
    }
    
    public void displayMhs(){    
        System.out.println("Kode Jurusan : "+this.kode);
        System.out.println("Nama Jurusan : " +this.namaJurusan);
        System.out.println("Daftar Mahasiswa: ");
        
        if(jml < daftar.length){
            for(int i=0; i<jml; i++){
                System.out.println("- "+daftar[i].getNimMhs());
            }
        }        
    }  
}
