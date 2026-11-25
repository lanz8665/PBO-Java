package P11_Agregasi;
public class Main {
    public static void main(String[] args){
        
        //membuat objek jurusan
        Jurusan j = new Jurusan("55201","Teknik Informatika");

        //membuat object Mhs 1
        Mahasiswa m1 = new Mahasiswa();
        m1.setNimMhs("5520112101");
        m1.setNamaMhs("Chaira");
        
        //membuat object Mhs 2
        Mahasiswa m2 = new Mahasiswa();
        m2.setNimMhs("5520112102");
        m2.setNamaMhs("Innara");
        
        j.addMhs(m1);
        j.addMhs(m2);
        j.displayMhs();
    } 
}
