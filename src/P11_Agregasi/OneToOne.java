package P11_Agregasi;

class Pemilik{
    private String nama;

    public Pemilik(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
}
class Laptop{
    private String merk;
    private Pemilik pemilik;
    
    public Laptop(String merk, Pemilik pemilik){
        this.merk = merk;
        this.pemilik = pemilik;
    }
    
    public void infoLaptop(){
        System.out.println("Nama Pemilik: " + pemilik.getNama());
        System.out.println("Merk Laptop: " + merk);
    }
}

public class OneToOne {
    public static void main(String[] args) {
        Pemilik pemilik = new Pemilik("Arcelia");
        Laptop p = new Laptop("Asus Vivo Book", pemilik);
        p.infoLaptop();
    }                
}
