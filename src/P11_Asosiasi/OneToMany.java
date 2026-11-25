package P11_Asosiasi;
public class OneToMany {
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa("Budi","1001");
        Mahasiswa m2 = new Mahasiswa("Siti","1002");
        
        Dosen D1 = new Dosen("04180401");
        
        D1.setNpm(m1.getNpm());
        D1.setNpm(m2.getNpm());
        
        int jml = D1.getJmlMhs();
        
        System.out.println("NIDN: "+D1.getNidn());
        System.out.println("Mengajar Mahasiswa: ");        
        for(int i=0; i<jml; i++){
            System.out.println(D1.getNpm(i));            
        }
    }
}
